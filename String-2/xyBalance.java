/*
We'll say that a String is xy-balanced if for all the 'x' chars in the string,
there exists a 'y' char somewhere later in the string. So "xxy" is balanced, but "xyx" is not.
One 'y' can balance multiple 'x's. Return true if the given string is xy-balanced.
*/
public boolean xyBalance(String str) {
  int counterX=0;
  int counterY=0;
  for(int i=0; i<str.length(); i++)
  {
    if (str.charAt(i)=='x')
    {
      counterX++;
      for(int y=i+1; y<str.length(); y++)
      {
        if (str.charAt(y)=='y') 
        {
          counterY++;
          break;
        }
      }
    }
  }
  return counterX==counterY;
}
