/*
Given a string, return the length of the largest "block" in the string.
A block is a run of adjacent chars that are the same.
*/
public int maxBlock(String str) {
  int counter = 0;
  int charC = 1;
  for (int i=0; i<str.length()-1; i++)
  {
    if (str.charAt(i) == str.charAt(i+1)) charC++;
    else charC = 1;
    if (counter < charC) counter = charC;
  }
  return counter;
}
