/*
Given a string and a non-empty word string, return a version of the original
String where all chars have been replaced by pluses ("+"), except for appearances
of the word string which are preserved unchanged.
*/
public String plusOut(String str, String word) {
  String desired = new String();
  int wordLen = word.length();
  for(int i=0; i<str.length(); i++)
  {
    if (i<=str.length()-wordLen 
        && str.substring(i,i+wordLen).equals(word))
    {
      desired += word;
      i += wordLen-1;
    }
    else desired += '+';
  }
  return desired;
}
