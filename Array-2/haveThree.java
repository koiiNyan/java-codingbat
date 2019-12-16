/*
Given an array of ints, return true
if the value 3 appears in the array exactly 3 times,
and no 3's are next to each other.
*/
public boolean haveThree(int[] nums) {
  int counter = 0;
  for(int i=0; i<nums.length; i++)
  {
    if (nums[i]==3)
    {
      if (i==nums.length-1) counter++;
      else if (nums[i+1] != 3) counter++;
    }
  }
  return counter ==3;
  
}
