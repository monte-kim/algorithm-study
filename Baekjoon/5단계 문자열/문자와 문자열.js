const fs = require('fs');

const input = fs.readFileSync('/dev/stdin').toString().split('\n');
const word = input[0];
const index = Number(input[1]);

console.log(word[index - 1]);
