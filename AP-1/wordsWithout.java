/*
Given an array of strings, return a new array without the strings
that are equal to the target string. One approach is to count the occurrences
of the target string, make a new array of the correct length, and then copy over the correct strings.
*/
public String[] wordsWithout(String[] words, String target) {
  int count = 0;
  for(int j=0; j<words.length; j++)
  {
    if(words[j].equals(target)) count++;
  }
  count = words.length - count;
  
  
  int index = 0;
  String[] desired = new String[count];
  
  for (int i=0; i<words.length; i++)
  {
    if(!words[i].equals(target))
    {
      desired[index] = words[i];
      index++;
    }
    
  }
  return desired;
}
