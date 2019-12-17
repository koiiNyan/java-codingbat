/*
Return true if the array contains, somewhere, three increasing adjacent numbers like .... 4, 5, 6, ... or 23, 24, 25.
*/
public boolean tripleUp(int[] nums) {
  boolean isThree = false;
  
  for(int i=0; i<nums.length-2;i++)
  {
    if(nums[i] == nums[i+1] - 1 && nums[i+1] == nums[i+2] - 1)
    isThree = true;
  }
  
  return isThree;
}
