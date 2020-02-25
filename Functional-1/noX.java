/*
Given a list of strings, return a list where each string has all its "x" removed.
*/
public List<String> noX(List<String> strings) {
  strings.replaceAll(n -> n.replace("x", ""));
  return strings;
}
