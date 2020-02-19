/*
Given two arrays, A and B, of non-negative int scores.
A "special" score is one which is a multiple of 10, such as 40 or 90.
Return the sum of largest special score in A and the largest special score in B.
To practice decomposition, write a separate helper method which finds
the largest special score in an array.
Write your helper method after your scoresSpecial() method.
*/
public int scoresSpecial(int[] a, int[] b) {
  return largestSpecial(a) + largestSpecial(b);
}

int largestSpecial(int[] arr)
{
  int max = 0;
  for(int i=0; i<arr.length; i++)
  {
    if (arr[i] % 10 == 0 && arr[i] > max)
      max = arr[i];
  }
  return max;
}
