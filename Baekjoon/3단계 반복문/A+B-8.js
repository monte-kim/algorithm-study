const fs = require('fs');

const input = fs.readFileSync('/dev/stdin').toString().split('\n');

const count = Number(input[0]);
let result = '';
for (let i = 1; i <= count; i += 1) {
  const [num1, num2] = input[i].split(' ');
  result += `Case #${i}: ${num1} + ${num2} = ${Number(num1) + Number(num2)}\n`;
}
console.log(result);
