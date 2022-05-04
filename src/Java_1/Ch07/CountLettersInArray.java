package Java_1.Ch07;

import Java_1.Ch06.RandomCharacter;

public class CountLettersInArray {
    public static void main(String[] args) {
        char[] letters = new char[100];
        int[] counts = new int[26];

        for(int i = 0; i < letters.length; i++){
            letters[i] = RandomCharacter.getRandomLowerCaseLetter();
            counts[letters[i] - 'a']++;
        }

        printArray(letters);
        printCounts(counts,letters);
    }

    public static void printArray(char[] array){
        for (int i = 1; i <= array.length; i++){

            if (i % 20 != 0)  System.out.printf("%4c%2s",array[i - 1],"  ");
            else System.out.printf("%4c%2s\n",array[i - 1],"  ");

        }
    }

    public static void printCounts(int[] counts, char[] arrays){
        for (int i = 1; i <= counts.length; i++){
            System.out.printf("%-2d%2c\n",counts[i - 1],(i + 'a' - 1));
        }
    }


}
