/*
Given 2 int values greater than 0, return whichever
value is nearest to 21 without going over. Return 0 if they both go over.
*/
public int blackjack(int a, int b) {
  int val1 = (a>21) ? 0:a;
  int val2 = (b>21) ? 0:b;
  return (Math.max(val1,val2));
}
