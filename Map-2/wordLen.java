/*
Given an array of strings, return a Map<String, Integer>
containing a key for every different string in the array,
and the value is that string's length.
*/
public Map<String, Integer> wordLen(String[] strings) {
  Map<String, Integer> map = new HashMap<String, Integer>();
  for (String key : strings) {
    map.put(key, key.length());
  }
  return map;
}
