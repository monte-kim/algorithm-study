const fs = require('fs');

const [input1, input2] = fs.readFileSync('/dev/stdin').toString().split('\n');

let [hour, minute] = input1.split(' ').map(Number);
const totalCookTime = Number(input2);

const cookHour = parseInt(totalCookTime / 60, 10) % 24;
const cookMinute = totalCookTime % 60;

hour += cookHour;
minute += cookMinute;

if (minute > 59) {
  minute -= 60;
  hour += 1;
}
if (hour >= 24) hour -= 24;

console.log(`${hour} ${minute}`);
