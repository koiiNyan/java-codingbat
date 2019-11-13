/*
Given 2 int arrays, each length 2, return a new array length 4 containing all their elements.
*/
public int[] plusTwo(int[] a, int[] b) {
  int[] desired = new int[4];
  for (int i=0; i<4; i++)
  {
    if(i<=1) desired[i] = a[i];
    else desired[i] = b[i-2];
  }
  return desired;
}
