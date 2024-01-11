const fs = require('fs');

let [hour, minute] = fs.readFileSync('/dev/stdin').toString().split(' ').map(Number);

if (minute >= 45) {
  minute -= 45;
} else if (minute < 45) {
  if (hour > 0) hour -= 1;
  else if (hour === 0) hour = 23;
  minute += 15;
}

console.log(`${hour} ${minute}`);
