const fs = require('fs');

const bj = () => {
  const year = fs.readFileSync('/dev/stdin');

  if (year % 400 === 0) {
    console.log(1);
    return;
  }
  if (year % 100 !== 0) {
    if (year % 4 === 0) {
      console.log(1);
      return;
    }
  }
  console.log(0);
};

bj();
