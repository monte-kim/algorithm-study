function solution(numbers, direction) {
  var answer = [];
  if (direction === "left") {
    for (let i = 0; i < numbers.length; i++) {
      if (i === numbers.length - 1) answer.push(numbers[0]);
      else answer.push(numbers[i + 1]);
    }
  } else if (direction === "right") {
    for (let i = 0; i < numbers.length; i++) {
      if (i === 0) answer.push(numbers[numbers.length - 1]);
      else answer.push(numbers[i - 1]);
    }
  }
  return answer;

  //   let temp;
  //   if(direction === "left"){
  //       temp = numbers.shift();
  //       numbers.push(temp);
  //   }
  //   else{
  //       temp = numbers.pop();
  //       numbers.unshift(temp);
  //   }
  //   return numbers;
}
