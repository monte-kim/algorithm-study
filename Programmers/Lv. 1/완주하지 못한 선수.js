function solution(participant, completion) {
  let answer = '';

  const nameMap = participant.reduce((map, el) => {
    if (map.has(el)) {
      map.set(el, map.get(el) + 1);
    } else {
      map.set(el, 1);
    }
    return map;
  }, new Map());

  completion.forEach((name) => {
    nameMap.set(name, nameMap.get(name) - 1);
  });
  // nameMap.forEach((count, name) => {
  //     if(completion.includes(name)){
  //         nameMap.set(name, nameMap.get(name) - 1);
  //     }
  // });  // 이렇게 하면 mislav 2번 다 없어짐.

  participant.forEach((name) => {
    if (nameMap.get(name) >= 1) {
      answer = name;
    }
  });
  return answer;
}

// A: "mislav"
solution(['mislav', 'stanko', 'mislav', 'ana'], ['stanko', 'ana', 'mislav']);
