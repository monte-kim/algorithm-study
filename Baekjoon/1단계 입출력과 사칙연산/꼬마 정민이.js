const fs = require('fs');

const [num1, num2, num3] = fs.readFileSync('/dev/stdin').toString().split(' ').map(Number);

console.log(num1 + num2 + num3);
