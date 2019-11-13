/*
Given an array of ints of even length, return a new array length 2 containing the middle two elements
from the original array. The original array will be length 2 or more.
*/
public int[] makeMiddle(int[] nums) {
  int middle = 0;
  int[] desired = new int[2];
  if (nums.length % 2 ==0)
  {
    middle = nums.length /2;
    desired[0] = nums[middle-1];
    desired[1] = nums[middle];
  }
  return desired;
}
