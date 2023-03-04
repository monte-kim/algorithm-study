const fs = require('fs');

const input = Number(fs.readFileSync('/dev/stdin'));

let sum = 0;
for (let i = 1; i <= input; i += 1) {
  sum += i;
}
console.log(sum);
