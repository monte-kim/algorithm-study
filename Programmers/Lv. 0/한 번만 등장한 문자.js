// function solution(s) {
//     var answer;
//     s = s.split('')
//     const sSet = [...new Set(s)];
//     answer = sSet.map((letter) => {
//         const count = s.filter((el) => el === letter).length;
//         if(count === 1) return letter;
//     })
//     return answer.sort().join('');
// }
function solution(s) {
  var answer = [];
  for (const letter of s) if (s.indexOf(letter) === s.lastIndexOf(letter)) answer.push(letter);
  return answer.sort().join('');
}
