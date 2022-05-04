package Ch10;

public class UseBMIClass {
    public static void main(String[] args){
        BMI bmi1 = new BMI("Kim Yang",18,145,70);
        System.out.println(bmi1.getName() + " " + bmi1.getBMI() + " " + bmi1.getStatus());

        BMI bmi2 = new BMI("Susan King",215,70);
        System.out.println(bmi2.getName() + " " + bmi2.getBMI() + " " + bmi2.getStatus());
    }
}
