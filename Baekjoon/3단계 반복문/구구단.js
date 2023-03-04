const fs = require('fs');

const input = Number(fs.readFileSync('/dev/stdin'));

for (let i = 1; i < 10; i += 1) {
  console.log(`${input} * ${i} = ${input * i}`);
}
