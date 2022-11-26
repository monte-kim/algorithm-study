function solution(array) {
  // var answer = 0;
  // let totalString=  '';
  // array.map((el) => {
  //     totalString += el.toString();
  // })
  // answer = totalString.split('').filter((el) => el === '7').length;
  // return answer;
  return array.join('').split('7').length - 1;
}
