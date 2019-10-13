/*
Given a string, return a new string made of 3 copies
of the lastb2 chars of the original string.
The string length will be at least 2.
*/
public String extraEnd(String str) {
  String desired = new String();
  if (str.length()>=2)
  {
   desired = str.substring(str.length()-2); 
   desired += desired += desired;
  }
  return desired;
}
