function solution(array) {
  var answer = 0;
  array.sort((a, b) => {
    return a - b;
  });
  answer = array[parseInt(array.length / 2)];
  return answer;
}
