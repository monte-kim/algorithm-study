function solution(board) {
  var answer = 0;
  let x = board.length;
  let y = board[0].length;
  for (let i = 0; i < x; i++) {
    for (let j = 0; j < y; j++) {
      if (board[i][j] === 1) {
        if (i !== 0 && j !== 0 && board[i - 1][j - 1] !== 1) board[i - 1][j - 1] = 2;

        if (i !== 0 && board[i - 1][j] !== 1) board[i - 1][j] = 2;

        if (i !== 0 && j !== y - 1 && board[i - 1][j + 1] !== 1) board[i - 1][j + 1] = 2;

        if (i !== 0 && j !== y - 1 && board[i][j + 1] !== 1) board[i][j + 1] = 2;

        if (i !== x - 1 && j !== y - 1 && board[i + 1][j + 1] !== 1) board[i + 1][j + 1] = 2;

        if (i !== x - 1 && board[i + 1][j] !== 1) board[i + 1][j] = 2;

        if (i !== x - 1 && j !== 0 && board[i + 1][j - 1] !== 1) board[i + 1][j - 1] = 2;

        if (j !== 0 && board[i][j - 1] !== 1) board[i][j - 1] = 2;
      }
    }
  }
  for (let i = 0; i < x; i++) {
    for (let j = 0; j < y; j++) {
      if (board[i][j] === 0) answer++;
    }
  }
  return answer;
  //   var answer = 0;
  //     let n = board.length;

  //     let dx = [0, 1, 1, 1, 0, -1, -1, -1]
  //     let dy = [-1, -1, 0, 1, 1, 1, 0, -1]

  //     for (let r = 0; r < n; r++) {
  //         for (let c = 0; c < n; c++) {
  //             if (board[r][c] === 1) {
  //                 for (let d = 0; d < 8; d++) {
  //                     let nr = r + dy[d]
  //                     let nc = c + dx[d]

  //                     if (nr < 0 || nr >= n || nc < 0 || nc >= n || board[nr][nc] === 1) {
  //                         continue
  //                     }
  //                     board[nr][nc] = 2
  //                 }
  //             }
  //         }
  //     }

  //     // console.log(board)

  //     answer = board.map(row => row.filter(value => value === 0).length).reduce((a, c) => a + c, 0)

  //     return answer;
}
