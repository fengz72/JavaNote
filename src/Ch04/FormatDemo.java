package Ch04;

public class FormatDemo {
    public static void main(String[] args){
        System.out.printf("%-10s%-10s%-10s%-10s%-10s\n", "Degrees", "Radians", "Sine", "Cosine", "Tangent");
        //degrees = 30
        int Degrees = 30;
        Double Radians = Math.toRadians(Degrees);
        System.out.printf("%-10d%-10.4f%-10.4f%-10.4f%-10.4f\n", Degrees , Math.toRadians(Degrees), Math.sin(Radians), Math.cos(Radians),
                 Math.tan(Radians));
        //degrees = 60
        Degrees = 60;
        Radians = Math.toRadians(Degrees);
        System.out.printf("%-10d%-10.4f%-10.4f%-10.4f%-10.4f\n", Degrees , Math.toRadians(Degrees), Math.sin(Radians), Math.cos(Radians),
                Math.tan(Radians));
    }
}
