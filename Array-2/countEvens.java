/*
Return the number of even ints in the given array.
*/
public int countEvens(int[] nums) {
  int counter = 0;
  for (int num : nums)
  {
    if (num % 2 == 0) counter++;
  }

  return counter;
}
