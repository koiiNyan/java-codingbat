/*
Given two strings, return true if either of the strings appears
at the very end of the other string, ignoring upper/lower case differences
*/
public boolean endOther(String a, String b) {
  int strLenA = a.length();
  int strLenB = b.length();
  if (strLenA>=strLenB)
    {
      if (a.substring(strLenA-strLenB).toLowerCase().equals(b.toLowerCase()))
      return true;
    }
  if (strLenA<=strLenB)
    {
      if (b.substring(strLenB-strLenA).toLowerCase().equals(a.toLowerCase()))
      return true;
    }
  
  return false;
}
