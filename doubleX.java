/*
Given a string, return true if the first instance of "x"
in the string is immediately followed by another "x".
*/
boolean doubleX(String str) {
  int indOfX = str.indexOf("x");
  if (indOfX>-1 && indOfX < str.length()-1)
  {
    if (str.substring(indOfX, indOfX +2).equals("xx"))
    return true;
  }
  
  return false;
}
