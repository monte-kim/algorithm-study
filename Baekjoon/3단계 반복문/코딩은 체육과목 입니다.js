const fs = require('fs');

const byte = Number(fs.readFileSync('/dev/stdin').toString());

for (let i = 1; i <= byte / 4; i += 1) {
  process.stdout.write('long ');
}
process.stdout.write('int');
