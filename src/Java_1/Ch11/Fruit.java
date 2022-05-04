package Ch11;

public class Fruit {
    public Fruit(){

    }

    public static void main(String[] args){
        Fruit fruit = new GoldenDelicious();
        Orange orange = new Orange();

        boolean b1 = fruit instanceof Fruit;
        boolean b2 = fruit instanceof Orange;
        boolean b3 = fruit instanceof Apple;
        boolean b4 = fruit instanceof McInTosh;

        GoldenDelicious goldenDelicious = new GoldenDelicious();
        goldenDelicious.makeAppleCider();
        ((GoldenDelicious)fruit).makeAppleCider();


    }
}

class Apple extends Fruit{
    public Apple(){

    }

    public void makeAppleCider(){

    }
}

class Orange extends Fruit{
    public Orange(){

    }
}

class GoldenDelicious extends Apple{
    public GoldenDelicious(){

    }
}

class McInTosh extends Apple{
    public McInTosh(){

    }
}
