function solution(my_string) {
  let answer = my_string.replaceAll("a", "").replaceAll("e", "").replaceAll("i", "").replaceAll("o", "").replaceAll("u", "");
  // var answer = my_string.split('a').join('');
  // answer = answer.split('e').join('');
  // answer = answer.split('i').join('');
  // answer = answer.split('o').join('');
  // answer = answer.split('u').join('');
  return answer;
}
