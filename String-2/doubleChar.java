/*
Given a string, return a string where for every char in the original, there are two chars.
*/
public String doubleChar(String str) {
  String desired = new String();
  for(int i=0; i<str.length();i++)
  {
    desired+= str.charAt(i);
    desired+= str.charAt(i);
  }
  return desired;
}
