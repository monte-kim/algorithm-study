function solution(id_pw, db) {
  var answer = "";
  let id = id_pw[0];
  let pw = id_pw[1];
  let idFound = db.find((el) => el[0] === id);
  if (!idFound) answer = "fail";
  else {
    if (pw === idFound[1]) answer = "login";
    else answer = "wrong pw";
  }
  return answer;
}
