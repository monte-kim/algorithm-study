function solution(score) {
  var answer = [];
  //   let scoreAvg = [];
  //   let ranking = [];
  //   let rankMap = new Map();

  //   for (let i = 0; i < score.length; i++) {
  //     scoreAvg.push((score[i][0] + score[i][1]) / 2);
  //   }
  //   ranking = [...scoreAvg];
  //   ranking.sort((a, b) => b - a);

  //   ranking.map((el, index, array) => {
  //     el = { avg: el, rank: index + 1 };
  //     array[index] = el;
  //   });

  //   ranking.map((el, index, array) => {
  //     if (index > 0 && array[index].avg === array[index - 1].avg) {
  //       el = { ...el, rank: array[index - 1].rank };
  //       array[index] = el;
  //     }
  //   });

  //   for (let avg of scoreAvg) {
  //     answer.push(ranking.find((el) => el.avg === avg).rank);
  //   }

  let total = score.map((el) => el[0] + el[1]);
  let rank = [...total].sort((a, b) => b - a);
  answer = total.map((el) => rank.indexOf(el) + 1);
  return answer;
}
