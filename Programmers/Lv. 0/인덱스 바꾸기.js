// function solution(my_string, num1, num2) {
//     var answer = '';
//     const firstLetter = my_string[num1];
//     const secondLetter = my_string[num2];
//     answer = replaceAt(my_string, num2, firstLetter);
//     answer = replaceAt(answer, num1, secondLetter);
//     return answer;
// }
// function replaceAt(my_string, index, letter){
//     return my_string.substr(0, index) + letter + my_string.substr(index+1);
// }
function solution(my_string, num1, num2) {
  my_string = my_string.split('');
  const firstLetter = my_string[num1];
  const secondLetter = my_string[num2];
  my_string[num1] = secondLetter;
  my_string[num2] = firstLetter;
  return my_string.join('');
}
