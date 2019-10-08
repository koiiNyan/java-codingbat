/*
Given a string, return a new string made of every other char starting with the first,
so "Hello" yields "Hlo".
/*
public String stringBits(String str) {
  String desired = new String();
  for (int i=0; i<str.length(); i+=2)
  {
    desired += str.charAt(i);
  }
  return desired;
}
