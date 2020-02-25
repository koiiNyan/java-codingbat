/*
Loop over the given array of strings to build a result string like this:
when a string appears the 2nd, 4th, 6th, etc. time in the array,
append the string to the result. Return the empty string if
no string appears a 2nd time.
*/
public String wordAppend(String[] strings) {
  String desired = new String();
  Map<String, Integer> map = new HashMap<String, Integer>();
  for(int i=0;i<strings.length;i++)
  {
    String s = strings[i];
    if (!map.containsKey(s)) {  
      map.put(s, 1);
    }
    else {
      int count = map.get(s);
      map.put(s, count + 1);
    if (map.get(s)!= 1 && map.get(s)%2==0)
    {
      desired += s;
    }
    }
}
return desired;
}
