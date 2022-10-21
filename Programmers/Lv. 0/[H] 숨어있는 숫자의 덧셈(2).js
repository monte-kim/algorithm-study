function solution(my_string) {
  var answer = 0;
  let arr = my_string.split("");
  let stack = [];
  let num;
  console.log(arr.length);
  for (let i = 0; i < arr.length; i++) {
    num = "";
    if (!isNaN(arr[i])) {
      stack.push(arr[i]);
    }
    if (i === arr.length - 1 || isNaN(arr[i])) {
      while (stack.length > 0) {
        num += stack.shift();
      }
      answer += Number(num);
    }
  }
  return answer;
}
