function solution(dots) {
  // let x, y = 0;
  // for(let i = 0; i < 4; i++){
  //     for(let j = 0; j < 4; j++){
  //         if(dots[i][0] !== dots[j][0])
  //             x = dots[i][0] - dots[j][0];
  //         if(dots[i][1] !== dots[j][1])
  //             y = dots[i][1] - dots[j][1];
  //     }
  // }
  // return Math.abs(x * y);
  let x = [],
    y = [];
  for (dot of dots) {
    x.push(dot[0]);
    y.push(dot[1]);
  }
  return (Math.max(...x) - Math.min(...x)) * (Math.max(...y) - Math.min(...y));
}
