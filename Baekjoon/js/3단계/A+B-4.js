const fs = require('fs');

const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');
const count = input.length;
let result = '';
for (let i = 0; i < count; i += 1) {
  const [num1, num2] = input[i].split(' ').map(Number);
  result += `${num1 + num2}\n`;
}
console.log(result);
