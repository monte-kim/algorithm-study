function solution(a, b) {
  var answer = '';
  const monthlyDays = [31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31];
  const dayOfTheWeek = ['THU', 'FRI', 'SAT', 'SUN', 'MON', 'TUE', 'WED'];
  let sum = 0;
  for (let i = 0; i < a - 1; i++) {
    sum += monthlyDays[i];
  }
  sum += b;
  answer = dayOfTheWeek[sum % 7];
  return answer;
}

// function solution(a, b){
//     var arr = ['SUN','MON','TUE','WED','THU','FRI','SAT'];
//     var date = new Date(`2016-${a}-${b}`);
//     var day = date.getDay()
//     return arr[day];
// }
