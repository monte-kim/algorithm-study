// function solution(array) {
//     var answer = [];
//     const sortedArray = [...array];
//     sortedArray.sort((a, b) => b - a);
//     const largestNum = sortedArray[0];
//     const index = array.indexOf(largestNum);
//     answer.push(largestNum);
//     answer.push(index);
//     return answer;
// }
function solution(array) {
  var answer = [];
  const largestNum = Math.max(...array);
  answer.push(largestNum, array.indexOf(largestNum));
  return answer;
}
