function toBinary(arr) {
  return arr.map((el) => el.toString(2).split('').map(Number));
}

function solution(n, arr1, arr2) {
  const binaryMap = [];
  const array1 = toBinary(arr1);
  const array2 = toBinary(arr2);
  array1.forEach((el) => {
    while (el.length < n) {
      el.unshift(0);
    }
    // map() 사용시 newArray1 = array1.map(... return el;);
  });
  array2.forEach((el) => {
    while (el.length < n) {
      el.unshift(0);
    }
  });

  array1.forEach((el, firstIndex) => {
    const walls = el
      .map((number, secondIndex) => (number || array2[firstIndex][secondIndex] ? '#' : ' '))
      .join('');
    binaryMap.push(walls);
  });
  return binaryMap;
}

// A: ["######", "### #", "## ##", " #### ", " #####", "### # "]
solution(6, [46, 33, 33, 22, 31, 50], [27, 56, 19, 14, 14, 10]);
