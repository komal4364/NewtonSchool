public class Stars5 {
    public static void main(String[] args) {
        vertical5();
        horizontal5();    
    }
    static void vertical5(){
        int i = 0;
        while (i < 5) {
            System.out.println('*');
            i = i + 1;
        }
    }
    
    static void horizontal5(){
        int i = 0;
        while (i < 5) {
            System.out.print("* ");
            i = i + 1;
        }
        System.out.println("");
    }
}
