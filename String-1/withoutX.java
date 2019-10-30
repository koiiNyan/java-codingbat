/*
Given a string, if the first or last chars are 'x', return the string without those 'x' chars,
and otherwise return the string unchanged.
*/
public String withoutX(String str) {
  String desired = new String();
  boolean firstX = false;
  boolean lastX = false;
  if (str.length()>=1)
    {
    if (str.substring(0,1).equals("x")) firstX = true;
    if (str.length() >1 && str.substring(str.length()-1).equals("x")) lastX = true;
    if (firstX && lastX) desired = str.substring(1,str.length()-1);
    else if(firstX && !lastX) desired = str.substring(1);
    else if(!firstX && lastX) desired = str.substring(0, str.length()-1);
    else desired = str;
    }
  else desired = str;
  return desired;
}
