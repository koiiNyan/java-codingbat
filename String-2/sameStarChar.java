/*
Returns true if for every '*' (star) in the string, if there are chars
both immediately before and after the star, they are the same.
*/
public boolean sameStarChar(String str) {
  int starsCounter = 0;
  int wordsCounter = 0;
  for(int i=0; i<str.length()-1;i++)
  {
    if (i!=0 && str.charAt(i)=='*')
    {
      starsCounter++;
      if (str.charAt(i-1)==str.charAt(i+1)) wordsCounter++;
    }
  }
  return starsCounter==wordsCounter;
}
