/*
Given two ints, each in the range 10..99, return true
if there is a digit that appears in both numbers, such as the 2 in 12 and 23. 
*/
public boolean shareDigit(int a, int b) {
  return(a/10 == b/10 || a%10 == b%10 ||
        a/10 == b % 10 || a%10 == b/10);
}
