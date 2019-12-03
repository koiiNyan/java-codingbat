/*
Given a string, look for a mirror image (backwards) string at both the beginning
and end of the given string. In other words, zero or more characters
at the very begining of the given string, and at the very end of the string
in reverse order (possibly overlapping). For example,
the string "abXYZba" has the mirror end "ab".
*/
public String mirrorEnds(String string) {
  int strLen = string.length();
  String tmp = new String();
  String tmp2 = new String();
  String fin = new String();
  
  for (int i = 0; i < strLen; i++) 
  {
    tmp += string.substring(i,i+1);
    tmp2 = "";
    int tmpLen = tmp.length();
    for (int j = tmpLen-1; j >= 0; j--) 
    {
      tmp2 += tmp.substring(j,j+1);
      if (tmp2.equals(string.substring(strLen-i-1,strLen)))
      fin = tmp;
    }
  }
  return fin;
}
