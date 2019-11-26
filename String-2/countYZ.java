/*
Given a string, count the number of words ending in 'y' or 'z' --
so the 'y' in "heavy" and the 'z' in "fez" count, but not the 'y' in "yellow"
(not case sensitive). We'll say that a y or z is at the end of a word
if there is not an alphabetic letter immediately following it. 
*/
public int countYZ(String str) {
  int counter = 0;
  String lowerCase = str.toLowerCase();
  for (int i=0; i<lowerCase.length();i++)
  {
    if (i==lowerCase.length()-1)
    {
      if (lowerCase.charAt(i)=='y' || lowerCase.charAt(i)=='z')
      counter++;
    }
    else 
    {
      if(!Character.isLetter(lowerCase.charAt(i+1)) &&
      (lowerCase.charAt(i)=='y' || lowerCase.charAt(i)=='z'))
      counter++;
    }
  }
  return counter;
}
