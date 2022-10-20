function solution(n, k) {
  var answer = 0;
  answer = n * 12000 + k * 2000;
  let bev = parseInt(n / 10);
  answer -= bev * 2000;
  return answer;
}
