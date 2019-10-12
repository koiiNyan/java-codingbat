/*
Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed,
but the "a" can be any char. The "yak" strings will not overlap.
/*

public String stringYak(String str) {
  String desired = new String();
  for (int i=0; i<str.length(); i++) 
  {
    if(i<= str.length()-3 && 
          str.charAt(i)=='y' && 
          str.charAt(i+1) =='a' &&
          str.charAt(i+2)=='k')
          i+=2;
    else desired += str.charAt(i);
  }
  return desired;
}
