const fs = require('fs');

const count = Number(fs.readFileSync('/dev/stdin'));

for (let i = 1; i <= count; i += 1) {
  for (let j = 1; j <= i; j += 1) {
    process.stdout.write('*');
  }
  console.log();
}
