/*
We want make a package of goal kilos of chocolate.
We have small bars (1 kilo each) and big bars (5 kilos each).
Return the number of small bars to use, assuming we
always use big bars before small bars. Return -1 if it can't be done.
*/
public int makeChocolate(int small, int big, int goal) {
int bigCapacity = goal/5;

if (bigCapacity>=big && goal-big*5<=small) 
 return goal-big*5;  
else if (bigCapacity<big && goal%5<=small)
 return goal%5;

else return -1;
}
