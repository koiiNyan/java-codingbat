/*
Given an array of ints, return true if it contains no 1's or it contains no 4's.
*/
public boolean no14(int[] nums) {
  int count1 = 0;
  int count4 = 0;
  
  for(int num : nums)
  {
    if (num ==1) count1++;
    if (num ==4) count4++;
  }
  
  return count1==0 || count4 ==0;
}
