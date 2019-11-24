/*
Given three ints, a b c, one of them is small, one is medium and one is large.
Return true if the three values are evenly spaced, so the difference between small
and medium is the same as the difference between medium and large.
*/
public boolean evenlySpaced(int a, int b, int c) {
  int min = Math.min(a, Math.min(b,c));
  int max = Math.max(a, Math.max(b,c));
  int med = 0;
  if(max==a)
  {
    if(min==b) med=c;
    else med=b;
  }
  else if(max==b)
  {
    if(min==a) med=c;
    else med=a;
  }
  else
  {
    if(min==a) med=b;
    else med=a;
  }
  if(max-med == med-min) return true;
  else return false;
}
