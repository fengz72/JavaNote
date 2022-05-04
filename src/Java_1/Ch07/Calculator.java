package Java_1.Ch07;

public class Calculator {
    public static void main(String[] args){
        if (args.length != 3){
            System.out.println("Usage: java calculator operand1 operator operand2");
            System.exit(1);
        }
        else {
            switch (args[1].charAt(0)){
                case '+':
                    System.out.println(Integer.parseInt(args[0]) + Integer.parseInt(args[2]));
                    break;
                case '-':
                    System.out.println(Integer.parseInt(args[0]) - Integer.parseInt(args[2]));
                    break;
                case '.':
                    System.out.println(Integer.parseInt(args[0]) * Integer.parseInt(args[2]));
                    break;
                case '/':
                    System.out.println(Integer.parseInt(args[0]) / Integer.parseInt(args[2]));
                    break;
            }
        }
    }
}
