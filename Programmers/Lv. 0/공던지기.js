function solution(numbers, k) {
  let i = ((k - 1) * 2) % numbers.length;
  return numbers[i];
}
