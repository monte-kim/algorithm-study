function solution(n) {
  let comp = Array(n + 1).fill(false);
  for (let i = 2; i * i <= n; i++) {
    if (!comp[i])
      for (let j = i * i; j <= n; j += i) {
        comp[j] = true;
      }
  }
  return comp.filter((el) => el).length;
}
