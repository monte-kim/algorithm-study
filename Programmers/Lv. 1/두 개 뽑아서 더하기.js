function getCombinations(array, selectNumber) {
  const results = [];
  if (selectNumber === 1) {
    return array.map((element) => [element]);
  }
  array.forEach((fixed, index, origin) => {
    const rest = origin.slice(index + 1);
    const combinations = getCombinations(rest, selectNumber - 1);
    const attached = combinations.map((combination) => [fixed, ...combination]);
    results.push(...attached);
  });
  return results;
}

function solution(numbers) {
  const sumPairs = getCombinations(numbers, 2);
  const sums = sumPairs.map((arr) => arr[0] + arr[1]);
  const answer = [...new Set(sums)].sort((a, b) => a - b);
  return answer;
}

// A: [2, 5, 7, 8, 12]
solution([5, 0, 2, 7]);
