/*
Start with two arrays of strings, a and b, each in alphabetical order,
possibly with duplicates. Return the count of the number of strings
which appear in both arrays. The best "linear" solution makes a single pass 
ver both arrays, taking advantage of the fact that they are in alphabetical order.
*/
public int commonTwo(String[] a, String[] b) {   
  int count = 0;
  String str = new String();
  for (int i = 0; i < b.length; i++) {
    for (int j = 0; j < a.length; j++) {
      if (a[j].equals(b[i]) && !str.contains(a[j])) {
        str += a[j];
        count++;
      }
    }
  }
  return count;
}
