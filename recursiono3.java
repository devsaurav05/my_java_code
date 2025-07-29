public class recursiono3 {
  public static void printSum(int i, int n, int sum){
   id(i == n){
    return;
   }
   sum += i;
    printSum(i+1, n, sum);
  }
    
}
