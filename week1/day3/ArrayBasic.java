package day3;

import java.util.Arrays;

public class ArrayBasic {
    public static void main(String[] args) {
        /*
        int []age;

        int num = Integer.parseInt(args[0]);
            
        age = new int[num];
        for (int i=0; i < age.length; i++) {
            age[i] = i*2;
            System.out.println(age[i]);
        }
        */
        int[] marksinp = new int[]{45, 79, 85, 32, 70};
        //GradeStudents(marksinp);
        //System.out.println(Arrays.toString(marksinp)); // {20, 79, 85, 32, 70} // pass by reference
            // {45, 79, 85, 32, 70}
        //GradeStudents(new int[]{55, 79, 85, 32, 75});
        //GradeStudents(new int[]{47, 72, 85, 32, 70});
        ReverseMarks(marksinp);
    }
    static void ReverseMarks(int []marks) {
        int []marksReverse = new int[marks.length];
        for (int i=marks.length-1; i >= 0; i--) {
            int j = 0;
            marksReverse[j] = marks[i];
        }
        System.out.println(Arrays.toString(marksReverse));
    }
    /* Decision Engine
        M < 60 - D
        60 < M < 70 - C
        70 < M < 80 - B
        M> 80 - A
    */
    static void GradeStudents(int []marks) {
        marks[0] = 20;
        String []Grades = new String[marks.length];
        for (int i = 0; i < marks.length; i++) {
            int studentMark = marks[i];
            if (studentMark < 60) {
                Grades[i] = "D";
            } else if ( 60 <= studentMark && studentMark <= 70) {
                Grades[i] = "C";
            } else if ( 70 <= studentMark && studentMark <= 80) {
                Grades[i] = "B";
            } else {
                Grades[i] = "A";
            }
        }
        System.out.println(Arrays.toString(Grades));
    }
}
