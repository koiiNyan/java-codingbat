/*
Given an array of strings, return a Map<String, Boolean>
where each different string is a key and its value is
true if that string appears 2 or more times in the array.
*/
public Map<String, Boolean> wordMultiple(String[] strings) {
  Map<String, Boolean> map = new HashMap<String, Boolean>();
   for (String key : strings)
  {
    if (!map.containsKey(key))
      map.put(key, false);
    else 
      map.put(key, true);
  }
  return map;
}
