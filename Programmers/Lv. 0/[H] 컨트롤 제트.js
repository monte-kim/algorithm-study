function solution(s) {
  var answer = 0;
  let arr = s.split(" ");
  while (arr.includes("Z")) arr.splice(arr.indexOf("Z") - 1, 2);
  arr.map((el) => {
    answer += Number(el);
  });
  //   let stack = [];
  //   let arr = s.split(" ");
  //   for(let i = 0 ; i < arr.length; i++){
  //       if(arr[i] === "Z")
  //           stack.pop();
  //       else if(arr[i] !== "Z")
  //           stack.push(arr[i])
  //   }
  //   stack.map((el) => answer += Number(el));
  return answer;
}
