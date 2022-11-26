function solution(my_str, n) {
  var answer = [];
  let start = 0;
  while (start < my_str.length) {
    answer.push(my_str.substr(start, n));
    start += n;
  }
  return answer;
}
