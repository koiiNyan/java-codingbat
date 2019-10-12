/*
Given an array of ints, return the number of 9's in the array.
*/
public int arrayCount9(int[] nums) {
  int counter = 0;
  for (int i : nums)
  {
    if (i==9) counter++;
  }
  return counter;
}
