package Ch08;

public class Welcome {
    public static void main(String[] args){
        int[][] matrix = {{1,2,3},{1,2,3},{1,2,3}};
        //不规则数组
        int[][] triangleArray = new int[5][];
        //
        int[][] matrix1 = new int[5][6];
        int[] array1 = {1,2};
        matrix1[0] = array1;
        System.out.println("matrix1[0][1] is " + matrix1[0][1]);
        //
        int[][] matrix2 = new int[10][10];
        for (int i = 0; i < matrix2.length; i++){
            for (int j = 0; j < matrix2[j].length; j++)
                matrix2[i][j] = (int)(Math.random() * 100);
        }
    }
}
