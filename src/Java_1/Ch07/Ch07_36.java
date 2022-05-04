package Java_1.Ch07;

public class Ch07_36 {
    public static void main(String[] args){
        boolean[][] queen = new boolean[8][8];
        int count = 0;
        do {
            int i = (int) (Math.random() * 8);
            int j = (int) (Math.random() * 8);
            if (rowAndColumn(i,j,queen) && duijiao(i,j,queen)){
                queen[i][j] = true;
                count++;
            }
        }while (count < 8);
        //打印
        for (int i = 0; i < queen.length; i++){
            for (int j = 0; j < queen[i].length; j++){
                if (queen[i][j])
                    System.out.printf("%1s","Q");
                else
                    System.out.printf("%1s","-");
            }
            System.out.println();
        }


    }
    public static boolean rowAndColumn(int i,int j,boolean[][] matrix){
        for (int row = 0, column = 0; row < matrix.length; row++,column++){
            if (matrix[i][column] || matrix[row][j])
                return false;
        }
        return true;
    }

    public static boolean duijiao(int i,int j,boolean[][] matrix){
        boolean isValid = true;
        for (int n = 0; (n <= i + j) && (n > i + j - 8); n++){
            if (matrix[n][i+j-n])
                isValid = false;
        }
        int x = Math.abs(i - j);
        for (int n = 0;(x + n < 8) && n < 8;n ++){
            if (i >= j){
                if (matrix[x + n][n])
                    isValid = false;
            }
            else {
                if (matrix[n][x + n])
                    isValid = false;
            }
        }
        return isValid;
    }
}
