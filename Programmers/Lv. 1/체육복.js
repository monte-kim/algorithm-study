function solution(n, l, r) {
  let lost = l;
  let reserve = r;
  lost.sort();
  reserve.sort();
  reserve.forEach((num) => {
    if (lost.includes(num)) {
      lost = lost.filter((el) => el !== num);
      reserve = reserve.filter((el) => el !== num);
    }
  });
  lost.forEach((num) => {
    if (reserve.includes(num - 1)) {
      lost = lost.filter((el) => el !== num);
      reserve = reserve.filter((el) => el !== num - 1);
    } else if (reserve.includes(num + 1)) {
      lost = lost.filter((el) => el !== num);
      reserve = reserve.filter((el) => el !== num + 1);
    }
  });
  return n - lost.length;
}

// A: 5
solution(5, [4, 2], [3, 5]);

// A: 4
solution(4, [2, 3], [3, 4]);
