/*
Given an array of strings, return the count of the number of strings with the given length.
*/
public int wordsCount(String[] words, int len) {
  int counter=0;
  for(String w : words)
  {
    if(w.length()==len) counter++;
  }
return counter;
}
