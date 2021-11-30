package Notebook;

public class Printf_Space {
    public static void main(String[] args){
        System.out.printf("%-8d%-9s%-8s \n",1234,"java\n","java");
        for (int i = 0;i < 100;i++)
            System.out.print("-");
        System.out.println();
        System.out.printf("%8d%8s%8.1f \n",1234,"\njava",5.63);
    }
}
//\n换行符占一个空格