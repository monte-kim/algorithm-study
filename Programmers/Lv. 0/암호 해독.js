function solution(cipher, code) {
  var answer = '';
  answer = cipher
    .split('')
    .filter((letter, index) => {
      return (index + 1) % code === 0;
    })
    .join('');
  return answer;
}
