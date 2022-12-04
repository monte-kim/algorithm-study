function solution(arr) {
  return arr.reduce((acc, number) => acc + number, 0) / arr.length;
}

// A: 2.5
solution([1, 2, 3, 4]);
