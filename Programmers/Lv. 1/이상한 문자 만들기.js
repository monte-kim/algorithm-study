// function solution(s) {
//   let answer = '';
//   let stack = [];
//   s.split('').forEach((letter, i) => {
//     if (letter !== ' ') {
//       stack.push(letter);
//     }
//     if (letter === ' ' || i === s.length - 1) {
//       if (stack.length !== 0) {
//         const result = stack
//           .map((el, index) => (index % 2 === 0 ? el.toUpperCase() : el.toLowerCase()))
//           .join('');
//         answer += result;
//         stack = [];
//       }
//       if (letter === ' ') answer += ' ';
//     }
//   });
//   return answer;
// }
function solution(s) {
  return s
    .split(' ')
    .map((word) => word
      .split('')
      .map((letter, index) => (index % 2 === 0 ? letter.toUpperCase() : letter.toLowerCase()))
      .join(''))
    .join(' ');
}

// A: "TrY HeLlO WoRlD"
solution('try hello world');
