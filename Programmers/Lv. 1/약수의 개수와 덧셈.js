function solution(left, right) {
  let answer = 0;
  for (let i = left; i <= right; i += 1) {
    if (Number.isInteger(Math.sqrt(i))) answer -= i;
    else answer += i;
  }
  return answer;
}

// A: 43
solution(13, 17);
