function solution(s1, s2) {
  var answer = 0;
  // s1.forEach((el) => {
  //     if(s2.includes(el)) answer++;
  // })
  answer = s1.filter((el) => s2.includes(el)).length;
  return answer;
}
