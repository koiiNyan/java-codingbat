/*
Given a string, return the longest substring that appears
at both the beginning and end of the string without overlapping.
For example, sameEnds("abXab") is "ab".
*/
public String sameEnds(String string) {
  int strLen = string.length();
  String tmp = new String();
  String fin = new String();
  
  for (int i = 0; i < strLen; i++) {
    tmp += string.charAt(i);
    int tmpLen = tmp.length();
    if (i < strLen / 2 && tmp.equals(string.substring(strLen-tmpLen,strLen)))
      fin = tmp;
  }
  return fin;
}
