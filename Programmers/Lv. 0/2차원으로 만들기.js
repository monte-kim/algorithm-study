function solution(num_list, n) {
  var answer = [];
  let len = num_list.length / n;
  for (let i = 1; i <= len; i++) {
    answer.push(num_list.splice(0, n));
  }
  return answer;
}
