function solution(my_string, letter) {
  var answer = my_string.split("");
  for (let i = 0; i < my_string.length; i++) {
    if (answer[i] === letter) answer[i] = "";
  }
  return answer.join("");
  //   return my_string.split(letter).join('');
}
