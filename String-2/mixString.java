/*
Given two strings, a and b, create a bigger string
made of the first char of a, the first char of b, the second char of a,
the second char of b, and so on. Any leftover chars go at the end of the result.
*/
public String mixString(String a, String b) {
  String desired = new String();
  int minLen = Math.min(a.length(), b.length());
  for(int i=0;i<minLen; i++)
  {
    desired+= a.charAt(i);
    desired+= b.charAt(i);
  }
  if(a.length() == minLen) desired += b.substring(minLen);
  else desired += a.substring(minLen);
  return desired;
}
