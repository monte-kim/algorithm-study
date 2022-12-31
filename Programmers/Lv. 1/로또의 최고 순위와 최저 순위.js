function solution(lottos, winNums) {
  const answer = [];
  let zeroCount = 0;
  const winCount = lottos.reduce((count, num) => {
    if (winNums.includes(num)) {
      return count + 1;
    }
    if (num === 0) {
      zeroCount += 1;
    }
    return count;
  }, 0);
  const rate = {
    6: 1,
    5: 2,
    4: 3,
    3: 4,
    2: 5,
    1: 6,
    0: 6,
  };
  answer.push(rate[winCount + zeroCount]);
  answer.push(rate[winCount]);
  return answer;
}

// A: [3, 5]
solution([44, 1, 0, 0, 31, 25], [31, 10, 45, 1, 6, 19]);
