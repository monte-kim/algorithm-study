function solution(phoneNumber) {
  const len = phoneNumber.length;
  return '*'.repeat(phoneNumber.substr(0, len - 4).length) + phoneNumber.substr(len - 4);
}

// A: "01033334444"
solution('********4444');
