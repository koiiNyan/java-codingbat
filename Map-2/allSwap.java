/*
We'll say that 2 strings "match" if they are non-empty
and their first chars are the same. Loop over and then return
the given array of non-empty strings as follows: if a string
matches an earlier string in the array, swap the 2 strings
in the array. When a position in the array has been swapped,
it no longer matches anything. Using a map, this can be solved
making just one pass over the array. More difficult than it looks.
*/
public String[] allSwap(String[] strings) {
  String[] desired = new String[strings.length];
  Map <Character, Integer> map = new HashMap<Character, Integer>();
  for(int i=0; i<strings.length; i++)
  {
    char c  = strings[i].charAt(0);
    if (map.containsKey(c))
    {
      int tmp=map.get(c);
      map.remove(c);
      desired[i]=desired[tmp];
      desired[tmp]=strings[i];
    }
    else
    {
      desired[i]=strings[i];
      map.put(c,i);
    }
  }
  return desired;
}
