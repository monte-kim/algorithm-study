function solution(arr) {
  // 효율성 테스트에서는 여기가 더 빨랐다.
  var answer = [];
  arr.forEach((number) => {
    if (answer.length === 0) {
      answer.push(number);
    } else {
      if (answer[answer.length - 1] !== number) {
        answer.push(number);
      }
    }
  });
  return answer;
}
// function solution(arr)
// {
//     return arr.filter((number, index) => {
//         return number !== arr[index + 1]
//     })
// }
