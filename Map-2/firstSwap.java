/*
We'll say that 2 strings "match" if they are non-empty
and their first chars are the same. Loop over and then
return the given array of non-empty strings as follows:
if a string matches an earlier string in the array,
swap the 2 strings in the array. A particular first char
can only cause 1 swap, so once a char has caused a swap,
its later swaps are disabled. Using a map,
this can be solved making just one pass over the array.
More difficult than it looks.
*/
public String[] firstSwap(String[] strings) {
   String[] desired = new String[strings.length];
  Map <Character, Integer> map = new HashMap<Character, Integer>();
  String usedChars = new String();
  for(int i=0; i<strings.length; i++)
  {
    char c  = strings[i].charAt(0);
    if (map.containsKey(c) && usedChars.indexOf(c) == -1)
    {
      int tmp=map.get(c);
      map.remove(c);
      desired[i]=desired[tmp];
      desired[tmp]=strings[i];
      usedChars += c;
    }
    else
    {
      desired[i]=strings[i];
      map.put(c,i);
    }
  }
  return desired;
}
