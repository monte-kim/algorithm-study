function solution(s, n) {
  const upperCase = ['A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'];
  const lowerCase = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'];
  return s
    .split('')
    .map((letter) => {
      if (upperCase.includes(letter)) {
        const index = upperCase.indexOf(letter);
        if (index + n >= 26) return upperCase[index + n - 26];
        return upperCase[index + n];
      }
      if (lowerCase.includes(letter)) {
        const index = lowerCase.indexOf(letter);
        if (index + n >= 26) return lowerCase[index + n - 26];
        return lowerCase[lowerCase.indexOf(letter) + n];
      }
      return letter;
    })
    .join('');
}

// A: "e F d"
solution('a B z', 4);
