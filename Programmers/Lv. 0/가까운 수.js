function solution(array, n) {
  var answer = 0;
  let min = Math.abs(Math.max(...array));
  let minIndex = 0;

  // 가장 가까운 수 중 작은 수를 구하기 위한 정렬
  array.sort();
  array.map((el, index) => {
    if (min > Math.abs(el - n)) {
      min = Math.abs(el - n);
      minIndex = index;
    }
  });
  return array[minIndex];
}
