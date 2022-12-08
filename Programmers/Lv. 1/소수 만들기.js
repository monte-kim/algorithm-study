// 소수 찾기
function getPrime(n) {
  const prime = Array(n + 1)
    .fill(true)
    .fill(false, 0, 2);
  for (let i = 2; i * i <= n; i += 1) {
    if (prime[i]) {
      for (let j = i * i; j <= n; j += i) {
        prime[j] = false;
      }
    }
  }
  return prime;
}

// 조합 찾기
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

function solution(nums) {
  nums.sort((a, b) => b - a);
  const maxSum = nums[0] + nums[1] + nums[2];
  const primeNumbers = getPrime(maxSum);
  const combs = getCombinations(nums, 3);
  const sums = combs.map((el) => el.reduce((sum, number) => sum + number, 0));
  return sums.filter((sum) => primeNumbers[sum]).length;
}

// A: 4
solution([1, 2, 7, 6, 4]);
