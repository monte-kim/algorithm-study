const fs = require('fs');

const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

input.shift();
input.forEach((word) => console.log(word[0] + word[word.length - 1]));
