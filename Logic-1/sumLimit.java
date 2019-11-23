/*
Given 2 non-negative ints, a and b, return their sum,
so long as the sum has the same number of digits as a.
If the sum has more digits than a, just return a without b. 
*/
public int sumLimit(int a, int b) {
  int sumAB = a + b;
  int lenSumAB = String.valueOf(sumAB).length();
  int lenA = String.valueOf(a).length();
  if (lenSumAB == lenA) return sumAB;
  else return a;
}
