function solution(n) {
  var answer = 0;
  let arr = [];
  for (let i = 1; arr.length < n; i++) {
    if (i % 3 === 0 || i.toString().includes("3")) {
      continue;
    }
    arr.push(i);
  }
  return arr[n - 1];
}
