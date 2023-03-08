const fs = require('fs');

const input = fs.readFileSync('/dev/stdin').toString().split('\n');

// eslint-disable-next-line no-unused-vars
const [n, x] = input[0].split(' ').map(Number);
const arr = input[1].split(' ').map(Number);

const result = arr.filter((el) => el < x);

console.log(result.join(' '));
