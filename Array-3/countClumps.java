/*
Say that a "clump" in an array is a series of 2 or more adjacent elements
of the same value. Return the number of clumps in the given array.
*/
public int countClumps(int[] nums) {
  boolean wasMatch = false;
  int counter = 0;
  for (int i = 0; i < nums.length-1; i++) 
  {
    if (nums[i] == nums[i+1] && !wasMatch) 
    {
      wasMatch = true;
      counter++;
    } 
    else if (nums[i] != nums[i+1]) 
    {
      wasMatch = false;
    }
  }
  return counter;
}
