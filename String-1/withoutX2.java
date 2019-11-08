/*
Given a string, if one or both of the first 2 chars is 'x',
return the string without those 'x' chars, and otherwise return the string unchanged.
This is a little harder than it looks.
*/
public String withoutX2(String str) {
  String desired = new String();
  boolean firstX = false;
  boolean lastX = false;
  if (str.length()>=2)
    {
    if (str.substring(0,1).equals("x")) firstX = true;
    if (str.length() >1 && str.substring(1,2).equals("x")) lastX = true;
    if (firstX && lastX) desired = str.substring(2);
    else if(firstX && !lastX) desired = str.substring(1);
    else if(!firstX && lastX) desired = str.substring(0, 1) + str.substring(2);
    else desired = str;
    }
  else if(str.equals("x")) desired = "";
  else desired = str;
  return desired;
}
