function solution(my_string) {
  var answer = 0;
  my_string.split("").map((el) => {
    if (!isNaN(el)) answer += Number(el);
  });
  return answer;
}
