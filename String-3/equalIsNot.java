/*
Given a string, return true if the number of appearances of "is" anywhere
in the string is equal to the number of appearances of "not" anywhere in the string
(case sensitive).
*/
public boolean equalIsNot(String str) {
  int countIs = count(str,"is");
  int countNot = count(str,"not");
  return countIs==countNot;
}

public int count(String str, String len) {
  int counter=0;
  for(int i=0;i<=str.length()-len.length();i++)
  {
    if(str.substring(i,len.length()+i).equals(len)) counter++;
  }
  return counter;
}
