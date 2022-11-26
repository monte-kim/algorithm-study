function solution(babbling) {
  var answer = 0;
  babbling.forEach((word) => {
    const splitResult = word.split(/aya|ye|woo|ma/).filter((el) => el !== '');
    if (splitResult.length === 0) answer++;
  });
  return answer;
}
