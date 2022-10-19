function solution(array) {
  var answer = 0;
  let cnt;
  let count = [];
  let myArr = [...new Set(array)];
  for (let i = 0; i < myArr.length; i++) {
    cnt = 0;
    for (let j = 0; j < array.length; j++) {
      if (array[j] === myArr[i]) cnt++;
    }
    count.push(cnt);
  }
  // let maxCnt = 0;
  // answer = array[count.indexOf(Math.max(...count))];
  // for(let i = 0; i < count.length; i++){
  //     if(count[i] === Math.max(...count))
  //         maxCnt++;
  // }
  // if(maxCnt > 1)
  //     return -1;
  let max = Math.max(...count);
  let j = count.indexOf(max);

  answer = myArr[j];

  for (var i = 0; i < count.length; i++) {
    if (count[i] === max && i != j) answer = -1;
  }
  return answer;
}
