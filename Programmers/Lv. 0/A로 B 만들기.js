function solution(before, after) {
  //   let letter = new Map();

  //   before.split("").map((el) => {
  //     if (letter.has(el)) {
  //       let count = letter.get(el);
  //       letter.set(el, count + 1);
  //     } else {
  //       letter.set(el, 1);
  //     }
  //   });
  //   after.split("").map((el) => {
  //     if (!letter.has(el)) return 0;
  //     else {
  //       if (letter.get(el) === 0) return 0;
  //       else {
  //         letter.set(el, letter.get(el) - 1);
  //       }
  //     }
  //   });
  //   for (let [key, value] of letter) if (value > 0) return 0;
  //   return 1;
  return before.split("").sort().join("") === after.split("").sort().join("") ? 1 : 0;
}
