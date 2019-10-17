/*
Given a string of any length, return a new string where the last 2 chars,
if present, are swapped, so "coding" yields "codign".
*/
public String lastTwo(String str) {
  String desired = new String();
  int len = str.length();
  if (len < 2) desired = str;
  else if(len == 2) desired = str.substring(1) + str.substring(0,1);
  else
  {
    desired += str.substring(0, len-2) + str.substring(len-1) +
    str.substring(len-2, len-1);
  }
  return desired;

}
