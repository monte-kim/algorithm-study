const fs = require('fs');

const input = fs.readFileSync('/dev/stdin').toString().split(' ').map(Number);
const dice1 = input[0];
const dice2 = input[1];
const dice3 = input[2];
if (dice1 === dice2 && dice2 === dice3) console.log(dice1 * 1000 + 10000);
else if (dice1 === dice2) console.log(dice1 * 100 + 1000);
else if (dice2 === dice3) console.log(dice2 * 100 + 1000);
else if (dice1 === dice3) console.log(dice1 * 100 + 1000);
else {
  const sortedDice = input.sort((a, b) => b - a);
  console.log(sortedDice[0] * 100);
}
