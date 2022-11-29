function solution(nums) {
  const numSet = new Set(nums);
  if (numSet.size > nums.length / 2) return nums.length / 2;
  return numSet.size;
}
