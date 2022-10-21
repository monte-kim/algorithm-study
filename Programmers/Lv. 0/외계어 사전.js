function solution(spell, dic) {
  spell = spell.sort().join("");
  for (let i = 0; i < dic.length; i++) {
    dic[i] = dic[i].split("").sort().join("");
  }
  //map으로는 안 됨
  if (dic.includes(spell)) return 1;
  return 2;
}
