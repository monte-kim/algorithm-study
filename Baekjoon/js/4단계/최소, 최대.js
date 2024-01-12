const fs = require('fs');

const input = fs.readFileSync('/dev/stdin').toString().split('\n');

const len = Number(input[0]);
const arr = input[1].split(' ').map(Number);
const sortedArr = arr.sort((a, b) => a - b);
const min = sortedArr[0];
const max = sortedArr[len - 1];

console.log(`${min} ${max}`);
