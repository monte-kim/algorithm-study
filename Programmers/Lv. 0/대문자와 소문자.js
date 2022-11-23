function solution(my_string) {
  var answer = '';
  answer = my_string
    .split('')
    .map((letter) => {
      const upperCase = letter.toUpperCase();
      const lowerCase = letter.toLowerCase();
      if (letter === upperCase) letter = lowerCase;
      else if (letter === lowerCase) letter = upperCase;
      return letter;
    })
    .join('');
  return answer;
}
