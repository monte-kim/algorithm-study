const fs = require('fs');

const input = fs.readFileSync('/dev/stdin').toString().split('\n');

// const length = Number(input[0]);
const arr = input[1].split(' ').map(Number);
const num = Number(input[2]);

const result = arr.filter((el) => el === num);

console.log(result.length);
