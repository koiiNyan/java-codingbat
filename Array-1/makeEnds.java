/*
Given an array of ints, return a new array length 2 containing
the first and last elements from the original array.
The original array will be length 1 or more.
*/
public int[] makeEnds(int[] nums) {
  int[] desired = new int[2];
  desired[0] = nums[0];
  desired[1] = nums[nums.length-1];
  return desired;
}
