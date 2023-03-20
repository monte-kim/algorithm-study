const fs = require('fs');

const input = fs
  .readFileSync('/dev/stdin')
  .toString()
  .toUpperCase()
  .trim()
  .split('');

const cnt = new Map();
input.forEach((el) => {
  const count = cnt.get(el);
  if (count > 0) cnt.set(el, count + 1);
  else cnt.set(el, 1);
});

const letters = [...cnt.keys()];
const counts = [...cnt.values()];
const maxCount = Math.max(...counts);
const maxCounts = counts.filter((el) => el === maxCount);
if (maxCounts.length > 1) console.log('?');
else {
  const index = counts.indexOf(maxCount);
  console.log(letters[index]);
}
