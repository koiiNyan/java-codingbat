/*
Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".
*/
public String altPairs(String str) {
  String desired = new String();
  if(str.length()<=2) return str;
  // Counter for pairs
  int counter = 0;
  for (int i=0; i< str.length(); i++)
  {
    // If not paired
    if(counter<2) 
    {
      desired += str.charAt(i);
      counter++;
    }
    // If desired string already has 2 pairs, count from +2 index
    // str.length-3 for not having an error with indexes
    else if(i<=str.length()-3)
    {
      i +=2;
      desired += str.charAt(i);
      counter--;
    }

  }
  return desired;
}
