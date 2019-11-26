/*
Given a string and a non-empty word string, return a string made of each char
just before and just after every appearance of the word in the string.
Ignore cases where there is no char before or after the word,
and a char may be included twice if it is between two words.
*/
public String wordEnds(String str, String word) {
  String desired = new String();
  int wordLen = word.length();
  int strLen = str.length();
  if (strLen <= wordLen) return desired;
  for (int i=0; i<strLen-wordLen+1;i++)
  {
    if(str.substring(i,wordLen+i).equals(word))
    {
      if(i==0) desired += str.charAt(wordLen);
      
      if(i>0 && i< strLen -wordLen) 
      {
        desired += str.charAt(i-1);
        desired += str.charAt(wordLen+i);
      }
      if(i == strLen -wordLen) desired += str.charAt(i-1);
    }
  }
  return desired;
}
