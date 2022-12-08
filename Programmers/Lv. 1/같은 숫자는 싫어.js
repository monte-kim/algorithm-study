function solution(arr) {
  // 효율성 테스트에서는 여기가 더 빨랐다.
  const answer = [];
  arr.forEach((number) => {
    if (answer.length === 0) {
      answer.push(number);
    }
    if (answer.length > 0 && answer[answer.length - 1] !== number) {
      answer.push(number);
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

// A: [1, 3, 0, 1]
solution([1, 1, 3, 3, 0, 1, 1]);
