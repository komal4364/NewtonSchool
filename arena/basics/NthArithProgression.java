public class NthArithProgression {
    public static void main(String[] args) {
       System.out.println(NthAP(2, 5, 3)); 
    }
    static int NthAP(int A, int B, int N){
        //Enter your code here
       int diff = B-A;
       int nthVal = A;
       for (int i = 1; i < N; i++) {
         nthVal = A + diff;
         A = nthVal;
       }
       return nthVal;
 }
}
