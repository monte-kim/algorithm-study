function solution(common) {
  var answer = 0;
  if (common[1] - common[0] === common[2] - common[1]) return common[common.length - 1] + common[2] - common[1];
  return (common[common.length - 1] * common[2]) / common[1];
}
// 등차수열인지 등비수열인지 원소들 사이를 비교할 것
