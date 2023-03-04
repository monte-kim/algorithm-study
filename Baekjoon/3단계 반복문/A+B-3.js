const fs = require('fs');

const input = fs.readFileSync('/dev/stdin').toString().split('\n');

for (let i = 1; i <= Number(input[0]); i += 1) {
  const [num1, num2] = input[i].split(' ').map(Number);
  console.log(num1 + num2);
}
