/*
Given two strings, append them together (known as "concatenation") and return the result.
However, if the concatenation creates a double-char, then omit one of the chars,
so "abc" and "cat" yields "abcat".
*/
public String conCat(String a, String b) {
  if ((a.length()>0 && b.length()>0) 
    && a.substring(a.length()-1).equals(b.substring(0,1)))
    return a + b.substring(1);
  return a + b;
}
