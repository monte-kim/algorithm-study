function solution(dots) {
  var answer = 0;
  let par = [];
  let temp;
  for (let i = 0; i < dots.length; i++) {
    for (let j = i + 1; j < dots.length; j++) {
      if (!par.includes((temp = (dots[i][1] - dots[j][1]) / (dots[i][0] - dots[j][0])))) par.push(temp);
      else return 1;
    }
  }
  return answer;
}
