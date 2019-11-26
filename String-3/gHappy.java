/*
We'll say that a lowercase 'g' in a string is "happy" if there is another 'g'
immediately to its left or right. Return true if all the g's in the given string are happy.
*/
public boolean gHappy(String str) {
  int gAll = 0;
  int gHappy = 0;
  if (str.length()<2) 
    {
      if(str.length()==0) return true;
      else return false;
    }
  for(int i=0;i<str.length();i++)
  {
    if(i==0 && str.charAt(i)== 'g')
    {
      gAll++;
      if (str.charAt(i+1)== 'g') gHappy++;
    }
    else if(i==str.length()-1 && str.charAt(i)=='g')
    {
      if(str.charAt(i-1)!='g') return false;
    }
    else if(i>0 && i<str.length()-1 && str.charAt(i)== 'g')
    {
      gAll++;
      if (str.charAt(i+1)== 'g' || str.charAt(i-1)== 'g') gHappy++;
    }

  }
  return gAll == gHappy;
}
