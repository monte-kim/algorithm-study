// data = "5 3"
// A:
// *****
// *****
// *****
process.stdin.setEncoding('utf8');
process.stdin.on('data', (data) => {
  const n = data.split(' ');
  const a = Number(n[0]);
  const b = Number(n[1]);
  console.log(`${'*'.repeat(a)}\n`.repeat(b));
});
