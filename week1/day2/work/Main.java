package day2.work;

class Main {
	public static void main (String[] args) {
        int result = 0;
        for (int i=0; i < args.length; i++) {
             result = result + Integer.parseInt(args[i]);
        }
        System.out.println(result);
	}
}