/*
Given a string and a non-negative int n, return a larger string that is n copies of the original string.
*/
public String stringTimes(String str, int n) {
  String desired = new String();
  for(int i=0; i<n; i++)
  {
    desired += str;
  }
  return desired;
}
