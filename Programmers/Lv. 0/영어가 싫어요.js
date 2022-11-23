// function solution(numbers) {
//     var answer = 0;
//     let stack = [];
//     const stringNumber = ['zero', 'one', 'two', 'three', 'four', 'five', 'six', 'seven', 'eight', 'nine'];
//     answer = numbers.split('').map((letter) => {
//         stack.push(letter);
//         const getNumberString = stack.join('')
//         if(stringNumber.includes(getNumberString)) {
//             const index = stringNumber.indexOf(getNumberString);
//             stack = [];
//             return index.toString();
//         }
//         else return '';
//     }).join('')
//     return Number(answer);
// }
function solution(numbers) {
  const stringNumbers = ['zero', 'one', 'two', 'three', 'four', 'five', 'six', 'seven', 'eight', 'nine'];
  stringNumbers.map((number, index) => {
    numbers = numbers.replaceAll(number, index);
  });
  return Number(numbers);
}
