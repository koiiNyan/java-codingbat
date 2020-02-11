/*
Given a string that contains a single pair of parenthesis,
compute recursively a new string made of only of the parenthesis
and their contents, so "xyz(abc)123" yields "(abc)".
*/
public String parenBit(String str) {
  int len = str.length();
  if (str.isEmpty()) return str;
  if (str.charAt(0) == '(') {
    if (str.charAt(len-1) == ')')
      return str;
    else 
      return parenBit(str.substring(0, len-1));
  } else
    return parenBit(str.substring(1));
}
