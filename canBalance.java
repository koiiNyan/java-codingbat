/*
Given a non-empty array, return true if there is a place to split the array
so that the sum of the numbers on one side is equal to the sum of the numbers on the other side.
*/
public boolean canBalance(int[] nums) {
  int leftSum = 0;
  for(int i=0; i<nums.length; i++)
  {
    leftSum += nums[i];
    int rightSum = 0;
    for (int j=i+1; j<nums.length; j++)
    {
      rightSum += nums[j];
    }
    if (leftSum == rightSum) return true;
  }
  return false;
}
