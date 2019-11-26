/*
Look for patterns like "zip" and "zap" in the string -- length-3,
starting with 'z' and ending with 'p'. Return a string where for all such words,
the middle letter is gone, so "zipXzap" yields "zpXzp".
*/
public String zipZap(String str) {
  String desired = new String();
  if (str.length()<3) return str;
  for (int i=0; i<str.length();i++)
  {
    if (str.charAt(i)=='z' && 
        str.charAt(i+2)=='p') 
        {
          desired += "zp";
          i+=2;
        }
        
    else desired += str.charAt(i);
  }
  return desired;
}
