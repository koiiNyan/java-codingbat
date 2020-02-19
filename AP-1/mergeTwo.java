/*
Start with two arrays of strings, A and B, each with its elements
in alphabetical order and without duplicates. Return a new array
containing the first N elements from the two arrays.
The result array should be in alphabetical order and without duplicates.
A and B will both have a length which is N or more.
The best "linear" solution makes a single pass over A and B,
taking advantage of the fact that they are in alphabetical order,
copying elements directly to the new array.
*/
public String[] mergeTwo(String[] a, String[] b, int n) {
  String desired[] = new String[n];
  int aindex =0, bindex=0;
  for(int i=0; i<n; i++)
  {
    int cmp = a[aindex].compareTo(b[bindex]);
    if(cmp<=0)
    {
      desired[i] = a[aindex++];
      if(cmp == 0) bindex++;
    }
    else
    {
      desired[i] = b[bindex++];
    }
  } 
  return desired;
}
