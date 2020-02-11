/*
Given a string and a non-empty substring sub,
compute recursively if at least n copies of sub appear
in the string somewhere, possibly with overlapping.
N will be non-negative.
*/
boolean match = false;
public boolean strCopies(String str, String sub, int n) {
  if (n == 0) match = true;

  if (str.indexOf(sub) != -1) 
    {
      match = false;
      n--;
      strCopies(str.substring(str.indexOf(sub)+1), sub, n);
    }
  return match;
}

