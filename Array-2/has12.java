/*
Given an array of ints, return true if there is a 1 in the array with a 2 somewhere later in the array.
*/
public boolean has12(int[] nums) {
  boolean has1 = false;
  boolean has12 = false;

  for (int i=0; i<nums.length; i++)
  {
    if(nums[i] == 1) has1 = true;
    
    if (has1 == true && nums[i] == 2) has12 = true;
  }
  return has12;
}
