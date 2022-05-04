package Java_1.Ch07;

public class DeckOfCard {
    public static void main(String[] args){
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
        //前四张牌
        for (int i = 0; i < 4; i++){
            String suit = suits[deck[i] / 13];
            String rank = ranks[deck[i] % 13];
            System.out.println("Card number " + deck[i] + " " + rank + " of " + suit);
        }

    }
}
