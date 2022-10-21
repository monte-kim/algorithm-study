function solution(strlist) {
  var answer = [];
  // for(str of strlist){
  //     answer.push(str.length);
  // }
  strlist.map((str) => {
    answer.push(str.length);
  });
  return answer;
}
