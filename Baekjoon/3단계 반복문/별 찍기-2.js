const fs = require('fs');

const count = Number(fs.readFileSync('/dev/stdin'));

let result = '';
for (let i = 1; i <= count; i += 1) {
  for (let j = 1; j <= count - i; j += 1) {
    result += ' ';
  }
  for (let k = 1; k <= i; k += 1) {
    result += '*';
  }
  result += '\n';
}
console.log(result);

// console.log()는 최소화하자.
