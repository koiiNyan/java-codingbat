/*
Given an int array of any length, return a new array of its first 2 elements.
If the array is smaller than length 2, use whatever elements are present.
*/
public int[] frontPiece(int[] nums) {
  int [] desired = new int[2];
  if (nums.length <2) return nums;
  else
  {
    desired[0] = nums[0];
    desired[1] = nums[1];
  }
  return desired;
}
