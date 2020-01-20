/*
Consider the series of numbers beginning at start and running up to but not including end,
so for example start=1 and end=5 gives the series 1, 2, 3, 4. 
Return a new String[] array containing the string form of these numbers, except for multiples of 3,
use "Fizz" instead of the number, for multiples of 5 use "Buzz", and for multiples of both 3 and 5 use "FizzBuzz".
*/
public String[] fizzBuzz(int start, int end) {
  String [] desired = new String[end-start];
  int index = 0;
  for(int i=start; i<end; i++)
  {
    if (i % 3 == 0 && i % 5 == 0) desired[index] = "FizzBuzz";
    
    else if (i % 3 == 0) desired[index] = "Fizz";
    
    else if (i % 5 == 0) desired[index] = "Buzz";
    
    else desired[index] = String.valueOf(i);
    
    index++;
  }
  return desired;
}
