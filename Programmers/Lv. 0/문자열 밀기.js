function solution(A, B) {
  for (let count = 0; count < A.length; count++) {
    if (A === B) return count;
    A = A.substr(A.length - 1) + A.substr(0, A.length - 1);
  }
  return -1;
}
