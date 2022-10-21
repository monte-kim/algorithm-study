function solution(keyinput, board) {
  let x = 0,
    y = 0;
  for (key of keyinput) {
    switch (key) {
      case "up":
        if (y < parseInt(board[1] / 2)) y++;
        break;
      case "down":
        if (y > -parseInt(board[1] / 2)) y--;
        break;
      case "left":
        if (x > -parseInt(board[0] / 2)) x--;
        break;
      case "right":
        if (x < parseInt(board[0] / 2)) x++;
        break;
      default:
        break;
    }
  }
  return [x, y];
}
