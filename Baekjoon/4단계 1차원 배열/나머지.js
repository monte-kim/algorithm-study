const fs = require('fs');

// eslint-disable-next-line newline-per-chained-call
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n').map(Number);

const result = input.map((el) => el % 42);
const resultSet = new Set(result);

console.log(resultSet.size);
