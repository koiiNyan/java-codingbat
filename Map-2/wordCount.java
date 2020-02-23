/*
The classic word-count algorithm: given an array of strings,
return a Map<String, Integer> with a key for each different string,
with the value the number of times that string appears in the array.
*/
public Map<String, Integer> wordCount(String[] strings) {
  Map<String, Integer> map = new HashMap<String, Integer>();
  
  for (String key : strings)
  {
    if (!map.containsKey(key))
      map.put(key, 1);
      
    else 
    {
      int counter = map.get(key);
      map.put(key, counter+1);
    }
  }
  return map;
}
