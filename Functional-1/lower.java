/*
Given a list of strings, return a list where each string is converted to lower case (Note: String toLowerCase() method).
*/
public List<String> lower(List<String> strings) {
  strings.replaceAll(n-> n.toLowerCase());
  return strings;
}
