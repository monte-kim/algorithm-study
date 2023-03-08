const fs = require('fs');

const input = fs.readFileSync('/dev/stdin').toString().split('\n').map(Number);

const sortedArr = [...input].sort((a, b) => b - a);
const max = sortedArr[0];
const index = input.indexOf(max) + 1;

console.log(`${max} ${index}`);
