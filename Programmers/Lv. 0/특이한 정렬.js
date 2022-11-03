function solution(numlist, n) {
  var answer = [];
  answer = numlist.sort((a, b) => {
    if (Math.abs(a - n) === Math.abs(b - n))
      // 차이가 없는 경우 더 큰 수를 앞으로
      return b - a;
    else return Math.abs(a - n) - Math.abs(b - n); // 차이가 있다면 n에 더 가까운 수를 앞으로
  });
  return answer;
}
