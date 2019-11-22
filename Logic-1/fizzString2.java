/*
Given an int n, return the string form of the number followed by "!".
So the int 6 yields "6!". Except if the number is divisible by 3 use "Fizz" instead of the number
and if the number is divisible by 5 use "Buzz", and if divisible by both 3 and 5, use "FizzBuzz".
*/
public String fizzString2(int n) {
  boolean by3 = (n % 3 ==0);
  boolean by5 = (n % 5 ==0);
  
  if (by3 && by5)  return "FizzBuzz!";
  else if (by3) return "Fizz!";
  else if (by5) return "Buzz!";
  return n+"!";
}
