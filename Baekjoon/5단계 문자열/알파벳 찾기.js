const fs = require('fs');

const input = fs.readFileSync('/dev/stdin').toString().trim().split('');

const result = new Array(26).fill(-1);
const inputSet = new Set();
input.forEach((el, index) => {
  if (!inputSet.has(el)) {
    result[el.charCodeAt(0) - 97] = index;
    inputSet.add(el);
  }
});

console.log(result.join(' '));
