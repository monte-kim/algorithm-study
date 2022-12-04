function solution(param) {
  let count = 0;
  let num = param;
  if (num === 1) return 0;
  while (count <= 500) {
    count += 1;
    num = num % 2 === 0 ? num / 2 : num * 3 + 1;
    if (num === 1) return count;
  }
  return -1;
}

// function solution(param) {
//   let count = 0;
//   let num = param;
//   while (num !== 1 && count <= 500) {
//     count += 1;
//     num = num % 2 === 0 ? num / 2 : num * 3 + 1;
//   }
//   return num === 1 ? count : -1;
// }

// A: -1
solution(626331);
