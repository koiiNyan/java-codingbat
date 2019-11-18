/*
Given 2 ints, a and b, return their sum. However, "teen" values in the range 13..19
inclusive, are extra lucky. So if either value is a teen, just return 19.
*/
public int teenSum(int a, int b) {
  boolean aTeen = false;
  boolean bTeen = false;
  if (a >= 13 && a <= 19) aTeen = true;
  if (b >= 13 && b <= 19) aTeen = true;
  
  if (aTeen || bTeen) return 19;
  
  else return a + b;
}
