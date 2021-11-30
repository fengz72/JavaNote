package Notebook;

import java.util.Scanner;

/*浮点数都是近似值，不能直接用==来判断是否相等
* */
public class Float {
    public static void main(String[] args){
        final double EPSILON_double = 1E-14;
        final  double EPSILON_float = 1E-7;//用于float类型的比较
        double x = 1 - 0.1 - 0.1 - 0.1;
        if (Math.abs(x - 0.7) < EPSILON_double)
            System.out.println("x = " + x + "认为是0.7");
    }

    //输入Y继续
    public void YesOrNot(){
        char continueLoop = 'Y';
        while (continueLoop == 'Y'){
            //逻辑
            System.out.println("Enter Y or N");
            Scanner input = new Scanner(System.in);
            continueLoop = input.nextLine().charAt(0);
        }
    }
}
/*从文件中读取输入
java FileName < input.txt
从文件读取输入然后出去给output
java FileName < input.txt > output.txt
 */

//b = a++ == b = a;a = a + 1
//b = ++a == a = a + 1:b = a
