/*
Given three ints, a b c, return true if one of them is 10 or more less than one of the others.
*/
public boolean lessBy10(int a, int b, int c) {
  boolean first = Math.abs(a - b) >= 10;
  boolean second = Math.abs(b - c) >= 10;
  boolean third = Math.abs(a - c) >= 10;
  return first || second || third;
}
