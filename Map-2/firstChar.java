/*
Given an array of non-empty strings, return a Map<String, String>
with a key for every different first character seen,
with the value of all the strings starting with that
character appended together in the order they appear in the array.
*/
public Map<String, String> firstChar(String[] strings) {
   Map<String, String> map = new HashMap<String, String>();
  
  for (String key : strings)
  {
    if (!map.containsKey(key.substring(0,1)))
      map.put(key.substring(0,1), key);
      
    else 
    {
      String val = map.get(key.substring(0,1));
      map.put(key.substring(0,1), val += key);
    }
  }
  return map;
}
