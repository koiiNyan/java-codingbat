/*
Given 2 int arrays, a and b, of any length,
return a new array with the first element of each array.
If either array is length 0, ignore that array.
*/
public int[] front11(int[] a, int[] b) {
  // Calculating space for a new array
  int maxLen = 0;
  if (a.length > 0 && b.length > 0) maxLen = 2;
  else if (
    (a.length == 0 && b.length >0 ||
    b.length == 0 && a.length >0) )
      maxLen = 1;
  int[] desired = new int[maxLen];
  
  // If 2 given arrays are empty, the desired array will be empty too, so returning 
    an empty array without any items
  if (maxLen == 0) return desired;
  if(a.length > 0 && b.length > 0)
  {
    desired[0] = a[0];
    desired[1] = b[0];
  }
  else if (a.length == 0) desired[0] = b[0];
  else desired[0] = a[0];
  return desired;
}
