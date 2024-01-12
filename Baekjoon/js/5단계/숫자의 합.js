const fs = require('fs');

const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const nums = input[1].split('').map(Number);

const result = nums.reduce((sum, num) => sum + num, 0);
console.log(result);
