const fs = require('fs');

const input = fs.readFileSync('/dev/stdin').toString().split('\n');

let result = '';
for (let i = 0; ; i += 1) {
  const [num1, num2] = input[i].split(' ').map(Number);
  if (num1 === 0 && num2 === 0) break;
  result += `${num1 + num2}\n`;
}
console.log(result);
