/*
Given a string, return a new string where the last 3 chars are now in upper case.
If the string has less than 3 chars, uppercase whatever is there.
*/
public String endUp(String str) {
  if (str.length()>=3)
  {
    int ind = str.length() - 3;
    String first = str.substring(0,ind);
    String sec = str.substring(ind).toUpperCase();
    return first + sec;
  }
  return str.toUpperCase();
}
