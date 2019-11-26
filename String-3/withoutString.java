/*
Given two strings, base and remove, return a version of the base string
where all instances of the remove string have been removed (not case sensitive).
You may assume that the remove string is length 1 or more. Remove only non-overlapping instances,
so with "xxx" removing "xx" leaves "x".
/*
public String withoutString(String base, String remove) {
  String desired = new String();
  int baseLen = base.length();
  int removeLen = remove.length();
  for(int i=0;i<baseLen;i++)
  {
    if (i<baseLen - removeLen+1)
    {
      if(base.substring(i,removeLen+i).toLowerCase().equals(remove.toLowerCase()))
      i+=removeLen-1;
      else desired += base.charAt(i);
    }
    else desired += base.charAt(i);
  }
  return desired;
}
