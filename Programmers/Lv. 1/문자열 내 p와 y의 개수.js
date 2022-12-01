function solution(s) {
  var answer = true;

  answer = s.split('').reduce((acc, letter) => {
    if (letter === 'p' || letter === 'P') acc++;
    else if (letter === 'y' || letter === 'Y') acc--;
    return acc;
  }, 0);

  return answer ? false : true;
}
