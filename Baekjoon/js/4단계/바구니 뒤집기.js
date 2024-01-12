const fs = require('fs');

const input = fs.readFileSync('/dev/stdin').toString().split('\n');

const [basketCounts, changeCounts] = input[0].split(' ').map(Number);
const ballNumbers = [];
for (let i = 0; i < basketCounts; i += 1) {
  ballNumbers[i] = i + 1;
}

let temp = [];
for (let i = 1; i <= changeCounts; i += 1) {
  const [basket1, basket2] = input[i].split(' ').map(Number);
  for (let j = basket1 - 1; j < basket2; j += 1) {
    temp.push(ballNumbers[j]);
  }
  temp.reverse();
  ballNumbers.splice(basket1 - 1, basket2 - basket1 + 1, ...temp);
  temp = [];
}

console.log(ballNumbers.join(' '));
