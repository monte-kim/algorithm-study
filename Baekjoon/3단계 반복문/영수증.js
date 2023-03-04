const fs = require('fs');

const input = fs.readFileSync('/dev/stdin').toString().split('\n');

const totalPrice = Number(input[0]);
const totalCount = Number(input[1]);
let sum = 0;
for (let i = 2; i < 2 + totalCount; i += 1) {
  const [price, count] = input[i].split(' ').map(Number);
  sum += price * count;
}
console.log(totalPrice === sum ? 'Yes' : 'No');
