/*
Given 2 positive int values, return the larger value that is in the range 10..20 inclusive,
or return 0 if neither is in that range.
*/
public int max1020(int a, int b) {
  boolean aInRange = false;
  boolean bInRange = false;
  if (a >= 10 && a <= 20) aInRange = true;
  if (b >=10 && b <=20) bInRange = true;
  if (aInRange && bInRange) return Math.max(a,b);
  if (!aInRange && bInRange) return b;
  if (!bInRange && aInRange) return a;
  return 0;
}
