function solution(absolutes, signs) {
  const answer = absolutes.reduce((sum, el, index) => {
    if (signs[index]) return sum + el;
    return sum - el;
  }, 0);
  return answer;
}

// 9
solution([4, 7, 12], [true, false, true]);

// Javascript reduce로 no-param-reassign Eslint 안 걸리기
// reduce는 결과를 반환하고 이를 다시 매개변수로 활용하기 때문에 (결과 = 매개변수 활용 연산) 방식
// 하지만 이 방법은 no-param-reassign Eslint에 걸려 오류처리 된다.
// 그렇다면 결과에 대입을 하지말고 (매개변수 활용 연산) 자체를 반환해버리자.
