package Ch10;

public class Course {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents = 0;

    public Course(String courseName){
        this.courseName = courseName;
    }

    public String getCourseName(){
        return courseName;
    }

    public void addStudent(String student){
        this.students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public void dropStudent(String student){
        int number = dropStudentNumber(student);
        if (number < 0)
            System.out.println("Not find " + student);
        else {
            for (int i = number; i < numberOfStudents - 1; i++){
                students[i] = students[i + 1];
            }
        }

        numberOfStudents--;
    }

    public int dropStudentNumber(String student){
        int number = -1;
        for (int i = 0; i < numberOfStudents; i ++){
            if (students[i].equalsIgnoreCase(student))
                number = i;
            }
        return number;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String[] getStudents() {
        return students;
    }
}
