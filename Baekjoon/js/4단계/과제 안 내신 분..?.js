const fs = require('fs');

const attendance = fs.readFileSync('/dev/stdin').toString().split('\n').map(Number);

const total = [];
for (let i = 1; i <= 30; i += 1) {
  total.push(i);
}

const result = total.filter((el) => !attendance.includes(el));
console.log(result.join('\n'));
