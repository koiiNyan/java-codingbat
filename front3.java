/*

Given a string, we'll say that the front is the first 3 chars of the string.
If the string length is less than 3, the front is whatever is there.
Return a new string which is 3 copies of the front.
*/
public String front3(String str) {
  int n = 3;
  if(str.length() < 3)
    {
      n = str.length();
    }
  StringBuilder sb = new StringBuilder(str.length() * 3);
  for (int i = 0; i < 3; i++)
    sb.append(str.substring(0,n));
  return sb.toString();
}
