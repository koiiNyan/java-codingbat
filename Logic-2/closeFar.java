/*
Given three ints, a b c, return true if one of b or c is "close"
(differing from a by at most 1), while the other is "far",
differing from both other values by 2 or more.
*/
public boolean closeFar(int a, int b, int c) {
  int val1 = Math.abs(a-b);
  int val2 = Math.abs(a-c);
  int val3 = Math.abs(b-c);
  return(val1<=1 && val2>=2 && val3>=2) || 
        (val1>=2 && val2<=1 && val3>=2);
}
