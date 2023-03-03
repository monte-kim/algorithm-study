const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const input = [];

rl.on('line', (line) => {
  input.push(line);
}).on('close', () => {
  const [x, y] = input;
  if (x > 0) {
    // eslint-disable-next-line no-unused-expressions
    y > 0 ? console.log(1) : console.log(4);
  } else {
    // eslint-disable-next-line no-unused-expressions
    y > 0 ? console.log(2) : console.log(3);
  }
  process.exit();
});
