/*
Given n>=0, create an array with the pattern {1,    1, 2,    1, 2, 3,   ... 1, 2, 3 .. n}
(spaces added to show the grouping). Note that the length of the array
will be 1 + 2 + 3 ... + n, which is known to sum to exactly n*(n + 1)/2.
*/
public int[] seriesUp(int n) {
  int [] desired = new int[n*(n + 1)/2];
  int len = 0;

  for (int i=1; i<=n; i++)
  {
    for (int j=1; j<=i; j++)
    {
      desired[len] = j;
      len++;
    }
  }
  
  return desired;
}
