/*
Given a string and an int n, return a string made of the first n characters of the string,
followed by the first n-1 characters of the string, and so on.
You may assume that n is between 0 and the length of the string, inclusive
*/
public String repeatFront(String str, int n) {
  String desired = new String();
  for(int i=0; i<n; i++)
  {
    desired += str.substring(0,n-i);
  }
  return desired;
}
