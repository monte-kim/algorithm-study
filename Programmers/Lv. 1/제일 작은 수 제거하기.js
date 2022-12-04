function solution(arr) {
  let answer = [];
  const minimum = Math.min(...arr);
  answer = arr.filter((el) => el !== minimum);
  return answer.length !== 0 ? answer : [-1];
}

// A: [4, 3, 2]
solution([4, 3, 2, 1]);
