const fs = require('fs');

const input = fs.readFileSync('/dev/stdin').toString().trim();

if (input === input.split('').reverse().join('')) console.log(1);
else console.log(0);
