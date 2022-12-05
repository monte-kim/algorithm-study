function solution(arr1, arr2) {
  return arr1.map((array, index) => array.map((num, innerIndex) => num + arr2[index][innerIndex]));
}

// A: [[4, 6], [7, 9]]
solution(
  [
    [1, 2],
    [2, 3],
  ],
  [
    [3, 4],
    [5, 6],
  ],
);
