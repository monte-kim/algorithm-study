function solution(polynomial) {
  let arr = polynomial.split(" + ");
  let x = 0,
    c = 0;
  for (let i = 0; i < arr.length; i++) {
    if (arr[i].includes("x")) {
      if (arr[i] === "x") x++;
      x += Number(arr[i].replace("x", ""));
    } else c += Number(arr[i]);
  }
  if (!x) {
    // x==0
    if (!c) return "0";
    return c.toString();
  }
  x = `${x === 1 ? "" : x}x`;
  if (!c) return `${x}`;
  return `${x} + ${c}`;
  // if(!c){ //c==0
  //     if(x === 1)
  //         return 'x';
  //     return `${x}x`;
  // }
  // if(x === 1)
  //     return 'x + ' + c.toString();
  // return `${x}x + ${c}`;
}
