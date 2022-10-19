function solution(array, height) {
  let arr = array.filter((x) => x > height);
  return arr.length;
}
