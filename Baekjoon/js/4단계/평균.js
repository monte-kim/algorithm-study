const fs = require('fs');

const input = fs.readFileSync('/dev/stdin').toString().split('\n');

const scores = input[1].split(' ').map(Number);
const max = Math.max(...scores);

const newScores = scores.map((el) => (el / max) * 100);
const sum = newScores.reduce((acc, el) => acc + el, 0);
console.log(sum / Number(input[0]));
