/*
Given a non-empty string like "Code" return a string like "CCoCodCode".
*/
public String stringSplosion(String str) {
  String desired = new String();
  for (int i=0; i<=str.length();i++)
  {
    desired += str.substring(0,i);
  }
  return desired;
}
