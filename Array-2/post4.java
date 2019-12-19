/*
Given a non-empty array of ints, return a new array
containing the elements from the original array that
come after the last 4 in the original array.
The original array will contain at least one 4.
Note that it is valid in java to create an array of length 0.
*/
public int[] post4(int[] nums) {
  int index = 0;
  boolean got4 = false;

  for (int i = nums.length - 1; i >= 0; i--)
  {

    if (!got4 && nums[i] == 4) 
    {
      got4 = true;
      index = i + 1;
    }
  }
return Arrays.copyOfRange(nums, index, nums.length);
}
