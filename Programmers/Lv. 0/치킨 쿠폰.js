function solution(chicken) {
  var answer = 0;
  let coupon = chicken;
  while (coupon > 9) {
    answer += parseInt(coupon / 10);
    coupon = parseInt(coupon / 10) + (coupon % 10);
  }
  return answer;
}
