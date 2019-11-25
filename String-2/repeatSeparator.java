/*
Given two strings, word and a separator sep,
return a big string made of count occurrences of the word,
separated by the separator string.
*/
public String repeatSeparator(String word, String sep, int count) {
  String desired = new String();
  for (int i=0; i<count; i++)
  {
    desired += word;
    if (i<count-1) desired+= sep;
  }
  return desired;
}
