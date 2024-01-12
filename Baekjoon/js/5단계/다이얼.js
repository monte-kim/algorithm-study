const fs = require('fs');

const input = fs.readFileSync('/dev/stdin').toString().trim().split('');

const alphabet = ['ABC', 'DEF', 'GHI', 'JKL', 'MNO', 'PQRS', 'TUV', 'WXYZ'];
const result = input.reduce((acc, letter) => {
  const index = alphabet.findIndex((el) => el.includes(letter));
  return acc + index + 3;
}, 0);

console.log(result);
