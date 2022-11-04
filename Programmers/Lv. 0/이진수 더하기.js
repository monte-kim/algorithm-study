function solution(bin1, bin2) {
  //   var answer = "";
  //   if (bin1 === "0" && bin2 === "0") return "0";
  //   let num1 = 0,
  //     num2 = 0;
  //   for (let i = 0; i < bin1.length; i++) {
  //     num1 += bin1[i] * 2 ** (bin1.length - i - 1);
  //   }
  //   for (let i = 0; i < bin2.length; i++) {
  //     num2 += bin2[i] * 2 ** (bin2.length - i - 1);
  //   }
  //   num = num1 + num2;
  //   while (num > 0) {
  //     answer += String(num % 2);
  //     num = parseInt(num / 2);
  //   }
  //   return answer.split("").reverse().join("");
  num1 = parseInt(bin1, 2);
  num2 = parseInt(bin2, 2);
  return (num1 + num2).toString(2);
}
