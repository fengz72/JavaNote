package Ch07;

public class Ch07_24 {
    public static void main(String[] args){
        int count = 0;
        boolean[] array = new boolean[4];
        while (!(array[0] && array[1] && array[2] && array[3])){
            array = choose(array);
            count++;
        }

        if (array[0] && array[1] && array[2] && array[3])
            System.out.println("Number of picks: " + count);

    }

    public static boolean[] choose(boolean[] array){
        int[] deck = new int[52];
        String[] suits = {"Spades" , "Hearts" , "Diamonds" , "Clubs"};
        String[] ranks = {"Ace","1","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
        //为数组赋值0-51
        for (int i = 0; i < deck.length; i++){
            deck[i] = i;
        }
        //shuffle
        for (int i = 0; i < deck.length; i++){
            int j = (int) (Math.random() * deck.length);
            int temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
        }
        //抽取第一张牌
        int a = (int)(Math.random() * deck.length);
        String suit = suits[deck[a] / 13];
        String rank = ranks[deck[a] % 13];

        switch (suit){
            case "Spades":
                if (!array[0]) {
                    System.out.println(rank + " of " + suit);
                    array[0] = true;
                }
                break;
            case "Hearts":
                if (!array[1]){
                    System.out.println(rank + " of " + suit);
                    array[1] = true;
                }
                break;
            case "Diamonds":
                if (!array[2]) {
                    System.out.println(rank + " of " + suit);
                    array[2] = true;
                }
                break;
            case "Clubs":
                if (!array[3]) {
                    System.out.println(rank + " of " + suit);
                    array[3] = true;
                }
                break;
        }

        return array;

    }
}
