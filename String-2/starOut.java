/*
Return a version of the given string, where for every star (*)
in the string the star and the chars immediately to its left and right are gone.
So "ab*cd" yields "ad" and "ab**cd" also yields "ad".
*/
public String starOut(String str) {
  String desired = new String();
  for (int i = 0; i < str.length(); i++) 
  {
    if (i == 0 && str.charAt(i) != '*')
      desired += str.charAt(i);
  
    if (i > 0 && str.charAt(i) != '*' && str.charAt(i-1) != '*')
      desired += str.charAt(i);
      
    if (i > 0 && str.charAt(i) == '*' && str.charAt(i-1) != '*')
      desired = desired.substring(0,desired.length()-1);
  }
  return desired;
}
