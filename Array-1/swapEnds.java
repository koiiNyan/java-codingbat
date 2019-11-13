/*
Given an array of ints, swap the first and last elements in the array.
Return the modified array. The array length will be at least 1.
*/
public int[] swapEnds(int[] nums) {
  int first = nums[0];
  int last = nums[nums.length-1];
  nums[0] = last;
  nums[nums.length-1] = first;
  return nums;
}
