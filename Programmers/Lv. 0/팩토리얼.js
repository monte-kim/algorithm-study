function solution(n) {
  let x = 1;
  while (factorial(x + 1) <= n) {
    x++;
  }
  return x;
  // let factorial = 1;
  // let x = 1;
  // while(f <= n){
  //     x++;
  //     factorial *= x;
  // }
  // return x - 1;
}

function factorial(n) {
  return n > 1 ? n * factorial(n - 1) : 1;
}
