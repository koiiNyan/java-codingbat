/*
Given three ints, a b c, return true if two or more of them have the same rightmost digit. The ints are non-negative.
*/
public boolean lastDigit(int a, int b, int c) {
  int modA = a % 10;
  int modB = b % 10;
  int modC = c % 10;
  return (modA==modB)||(modA==modC) || (modB==modC);
}
