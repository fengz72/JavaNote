package Ch05;

public class Ch05_07 {
    public static void main(String[] args){
        final int STUDENT_PAY = 10_000;
        final int YEAR = 10;
        final double RATE = 0.05;

        double currentStudentPay = STUDENT_PAY;
        for (int i = 0;i < YEAR;i++){
            currentStudentPay = currentStudentPay * (1 + RATE);
        }
        System.out.println("第十年学费为：" + currentStudentPay);

        double totalStudentPay = 0;
        for (int i = 0;i < 4;i++){
            currentStudentPay = currentStudentPay * (1 + RATE);
            totalStudentPay = totalStudentPay + currentStudentPay;
        }
        System.out.println("11-14的总学费为：" + totalStudentPay);
    }
}
