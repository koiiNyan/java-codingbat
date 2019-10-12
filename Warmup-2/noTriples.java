/*
Given an array of ints, we'll say that a triple is a value
appearing 3 times in a row in the array.
Return true if the array does not contain any triples.
*/
public boolean noTriples(int[] nums) {
  int counter=0;
  for(int i=0; i<nums.length-1; i++)
  {
    if(nums[i]==nums[i+1]) counter++;
    // If clause to exclude the index error
    if(counter>0 && nums.length==3 && 
        nums[i]==nums[nums.length-1]) return false;
    if (counter==3) return false;
  }
  return true;
}
