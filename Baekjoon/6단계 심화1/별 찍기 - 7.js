const fs = require('fs');

const input = fs.readFileSync('/dev/stdin').toString().trim();

const result = [];
for (let i = 1; i < input; i += 1) {
  const stars = '*'.repeat(i * 2 - 1);
  const side = ' '.repeat(input - i);
  result.push(`${side}${stars}`);
}
for (let i = input; i >= 1; i -= 1) {
  const stars = '*'.repeat(i * 2 - 1);
  const side = ' '.repeat(input - i);
  result.push(`${side}${stars}`);
}

console.log(result.join('\n'));
