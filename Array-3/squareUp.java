/*
Given n>=0, create an array length n*n with the following pattern,
shown here for n=3 : {0, 0, 1,    0, 2, 1,    3, 2, 1} (spaces added to show the 3 groups).
*/
public int[] squareUp(int n) {
  int [] desired = new int[n*n];
  int len = desired.length-1;
  int pos = 0;

  for (int i=n; i>0; i--)
  {
    for (int j=1; j<=i; j++)
    {
      desired[len] = j;
      len--;
    }
    len-=pos;
    pos++;
  }
  
  return desired;
}
