const fs = require('fs');

const [num1, num2] = fs.readFileSync('/dev/stdin').toString().split('\n');
const num2Digits = num2.split('').map(Number);

console.log(Number(num1) * num2Digits[2]);
console.log(Number(num1) * num2Digits[1]);
console.log(Number(num1) * num2Digits[0]);
console.log(Number(num1) * Number(num2));
