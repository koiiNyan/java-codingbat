/*
Given a string, return a version where all the "x" have been removed.
Except an "x" at the very start or end should not be removed.
*/
public String stringX(String str) {
  String desired = new String();
  for(int i=0; i<str.length(); i++)
  {
    if(str.charAt(i) == 'x' && i==0 || i== str.length()-1) desired += str.charAt(i);
    if(str.charAt(i) != 'x' && i<str.length()-1) desired += str.charAt(i); 
  }
  return desired;
}
