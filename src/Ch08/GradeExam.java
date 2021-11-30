package Ch08;

public class GradeExam {
    public static void main(String[] args){
        char[][] matrix = studentAnswer(8,10);
        char[] rightAnswer = {'D','B','D','C','C','D','A','E','A','D'};

        int max = 0;
        int indexOfMax = -1;
        for (int i = 0; i < matrix.length; i++){
            int count = 0;
            for (int j = 0; j < matrix[i].length; j++){
                if (matrix[i][j] == rightAnswer[j])
                    count++;
            }

            if (count > max){
                max = count;
                indexOfMax = i;
            }

            System.out.println("Student " + i + "'s corrent count is " + count);
        }

        System.out.println("The max point is " + max + ", the student is " + indexOfMax);

    }

    public static char[][] studentAnswer(int sNumber,int qNumber){
        sNumber = 8;
        qNumber = 10;
        char[][] matrix = new char[sNumber][qNumber];

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++)
                matrix[i][j] = (char) ((int)(Math.random() * 5 ) + 'A');
        }

        return matrix;
    }
}
