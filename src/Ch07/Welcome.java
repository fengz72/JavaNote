package Ch07;

public class Welcome {
    public static void main(String[] args){
        double[] array1 = new double[10];
        double[] array2 = {0.1,0.2};

        //找出最大元素
        double max1 = array1[0];
        for (int i = 0; i < array1.length; i++){
            if (array1[i] > max1)  max1 = array1[i];
        }

        //找出最大元素的最小下标
        double max2 = array2[0];
        int indexOfMax = 0;
        for (int i = 0; i < array2.length; i++){
            if (array2[i] > max2){
                max2 = array2[i];
                indexOfMax = i;
            }
        }

        //打乱(shuffling)
        double[] array3 = new double[10];
        for (int i = 0; i < array3.length - 1; i++){
            int j = (int) (Math.random() * array3.length);
            //交换i 和 j
            double temp = array3[i];
            array3[i] = array3[j];
            array3[j] = temp;
        }

        //foreach循环
        double[] array4 = new double[10];
        for (double e: array4){
            System.out.println(e);
        }

        //arraycopy方法
        int[] array5 = new int[10];
        int[] array6 = new int[9];
        for (int i = 0; i < array5.length; i++){
            array5[i] = (int)(Math.random() * array5.length);
            System.out.print(array5[i] + "   ");
        }
        System.out.println();
        java.lang.System.arraycopy(array5,0,array6,0,9);
        for (int e:array6){
            System.out.print(e + "   ");
        }

        int[] array7;
        array7 = new int[10];
        array7 = new int[20];
        System.out.println();
        System.out.println(array7.length);




    }


}
