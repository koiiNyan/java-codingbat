/*
A sandwich is two pieces of bread with something in between.
Return the string that is between the first and last appearance of "bread"
in the given string, or return the empty string "" if there are not two pieces of bread.
*/
public String getSandwich(String str) {
  int breadCounter = 0;
  int breadFirstInd = 0;
  int breadLastInd = 0;
  for (int i=0; i<str.length()-4; i++)
  {
    if(str.substring(i,i+5).equals("bread")) 
    {
      breadCounter++;
      if (breadCounter==1) breadFirstInd = i+5;
      else breadLastInd = i;
    }
  }
  
  if (breadCounter < 2) return "";
  else return str.substring(breadFirstInd,breadLastInd);
}
