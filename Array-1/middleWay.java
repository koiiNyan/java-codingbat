/*
Given 2 int arrays, a and b, each length 3,
return a new array length 2 containing their middle elements.
*/
public int[] middleWay(int[] a, int[] b) {
  int[] desired = new int[2];
  desired[0] = a[1];
  desired[1] = b[1];
  return desired;
}
