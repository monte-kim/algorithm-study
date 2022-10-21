function solution(box, n) {
  let x, y, z;
  x = parseInt(box[0] / n);
  y = parseInt(box[1] / n);
  z = parseInt(box[2] / n);
  return x * y * z;
}
