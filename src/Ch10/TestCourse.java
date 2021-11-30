package Ch10;

import java.util.Arrays;

public class TestCourse {
    public static void main(String[] args){
        Course course1 = new Course("Data Structures");
        Course course2 = new Course("Database System");

        course1.addStudent("He Jun");
        course1.addStudent("Liu Tao");
        course1.addStudent("Dong YuGang");

        course2.addStudent("He Jun");
        course2.addStudent("Gan Ping");

        System.out.println(course1.getNumberOfStudents());
        String[] students = course1.getStudents();
        for (String e: students){
            System.out.print(e);
            System.out.print(" ");
        }
        System.out.println();
        System.out.println(Arrays.toString(students));

        for (int i = 0; i < course1.getNumberOfStudents(); i++){
            System.out.print(students[i]);
            System.out.print("  ");
        }
        System.out.println();

        //dropStudent
        course1.dropStudent("He Jun");
        String[] newStudents = course1.getStudents();
        for (int i = 0; i < course1.getNumberOfStudents(); i++){
            System.out.print(newStudents[i]);
            System.out.print("  ");
        }


        System.out.println();
        System.out.println(course2.getNumberOfStudents());
    }
}
