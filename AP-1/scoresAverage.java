/*
Given an array of scores, compute the int average of the first half
and the second half, and return whichever is larger. We'll say that
the second half begins at index length/2. The array length will be
at least 2. To practice decomposition, write a separate helper method
int average(int[] scores, int start, int end) { which computes the average
of the elements between indexes start..end. Call your helper method twice
to implement scoresAverage(). Write your helper method after your scoresAverage()
method in the JavaBat text area. Normally you would compute averages with doubles,
but here we use ints so the expected results are exact.
*/
public int scoresAverage(int[] scores) {
 int secInd = scores.length / 2; 
 int firstEnd =  secInd - 1;
 int secEnd = scores.length - 1;
 
 int aver1 = average(scores, 0, firstEnd);
 int aver2 = average(scores, secInd, secEnd);
 
 return Math.max(aver1,aver2);
 
}

int average(int[] scores, int start, int end) {
 int sum = 0;
 int len = end - start + 1;
 
 for (int i = 0; i < len; i++)
 {
   sum+= scores[start+i];
 }
 
 return sum/len; 
}
