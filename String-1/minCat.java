/*
Given two strings, append them together (known as "concatenation") and return the result.
However, if the strings are different lengths, omit chars from the longer string
so it is the same length as the shorter string. So "Hello" and "Hi" yield "loHi".
The strings may be any length.
*/
public String minCat(String a, String b) {
  String desired = new String();
  if (a.length() > b.length())
  {
    int pos = a.length() - b.length();
    desired = a.substring(pos) + b;
  }
  else if (b.length() > a.length())
  {
    int pos = b.length() - a.length();
    desired = a + b.substring(pos);
  }
  else
  {
    desired = a + b;
  }
  return desired;
}
