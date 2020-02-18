/*
Given an array of strings, return a new List (e.g. an ArrayList)
where all the strings of the given length are omitted.
*/
public List wordsWithoutList(String[] words, int len) {
  List desired = new ArrayList();
  for ( String w : words )
  {
    if (w.length() != len) desired.add(w);
  }
  return desired;
}
