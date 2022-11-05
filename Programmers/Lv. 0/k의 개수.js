function solution(i, j, k) {
  // var answer = 0;
  // let number; //자연수
  // for(let number = i; number <= j; number++){
  //     answer += check(number, k);
  // }
  // return answer;
  let a = "";
  for (i; i <= j; i++) {
    a += i;
  }
  return a.split(k).length - 1;
}

// function check(num, k) {
//   let count = 0;
//   num = num.toString().split("");
//   num.map((letter) => {
//     if (letter == k) count++;
//   });
//   return count;
// }
