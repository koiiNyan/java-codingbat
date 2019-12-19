/*
Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns {2, 5, 3, 6}.
You may modify and return the given array, or return a new array.
*/
public int[] shiftLeft(int[] nums) {
  int [] desired = new int[nums.length];
  if (nums.length<1) return desired;
  
  for (int i =0; i<nums.length-1; i++)
  {
    desired[i] = nums[i+1];
  }
  desired[nums.length-1] = nums[0];
  
  return desired;
}
