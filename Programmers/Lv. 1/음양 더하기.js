function solution(absolutes, signs) {
  const answer = absolutes.reduce((sum, el, index) => {
    if (signs[index]) return sum + el;
    return sum - el;
  }, 0);
  return answer;
}

// 9
solution([4, 7, 12], [true, false, true]);
