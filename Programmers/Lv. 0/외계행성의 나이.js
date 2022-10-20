function solution(age) {
  var answer = "";
  while (age > 0) {
    answer += String.fromCharCode(97 + (age % 10));
    age = parseInt(age / 10);
  }
  return answer.split("").reverse().join("");
}
