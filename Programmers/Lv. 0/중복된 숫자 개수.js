function solution(array, n) {
  var answer = 0;
  // let Array = array.filter((num) => num === n);
  // answer = Array.length;
  for (let i = 0; i < array.length; i++) {
    if (array[i] === n) answer++;
  }
  return answer;
}
