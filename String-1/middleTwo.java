/*
Given a string of even length, return a string made of the middle two chars,
so the string "string" yields "ri". The string length will be at least 2.
*/
public String middleTwo(String str) {
  String result = new String();
  if (str.length() % 2 == 0)
  {
    int mid = str.length()/2;
    result = str.substring(mid-1,mid+1);
  }
  return result;
}
