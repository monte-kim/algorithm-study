// 중복된 부분은 배열에서 제외시키면서 길이 저장
// 한계점: 점의 개수가 4개 이상으로 늘어나면 사용 못함.
function solution(lines) {
  var answer = 0;
  const temp = lines.reduce((acc, [x, y]) => {
    for (let i = x; i < y; i++) {
      if (!acc.includes(i)) acc.push(i);
      else {
        acc = acc.filter((el) => el !== i);
        answer++;
      }
    }
    return acc;
  }, []);
  return answer;
}

// 중복된 부분을 배열로 저장
// function solution(lines) {
//   let min = Math.min(...lines.flat());
//   let max = Math.max(...lines.flat());
//   let arr = Array(max-min+1).fill(0);

//   for (let line of lines) {
//       line.sort((a,b)=>a-b);
//       if (min < 0) {
//           line[0]+=Math.abs(min)
//           line[1]+=Math.abs(min)
//       }
//       for (let i = line[0]; i < line[1]; i++) arr[i]++;
//   }

//   return arr.filter(v=>v>1).length;
// }
