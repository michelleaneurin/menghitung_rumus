import java.util.ArrayList;

class Player1 {
    String name;
    int score;

    public Player1(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public void display() {
        System.out.println("Name: " + name + ", Score: " + score);
    }
}

class A_Player extends Player1 {
    public A_Player(String name, int score) {
        super(name, score);
    }
}

class B_Player extends Player1 {
    public B_Player(String name, int score) {
        super(name, score);
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<String> DataList = new ArrayList<>();
        DataList.add("Hello");
        DataList.add("World");
        System.out.println(DataList);

        Player1 p1 = new Player1("wira", 100);
        Player1 p2 = new Player1("wiro", 99);
        A_Player p3 = new A_Player("wiru", 88);
        B_Player p4 = new B_Player("wiri", 77);

        ArrayList<Player1> ListPlayer = new ArrayList<>();
        ListPlayer.add(p1);
        ListPlayer.add(p2);
        ListPlayer.add(p3);
        ListPlayer.add(p4);

        System.out.println("Get 2 =" + ListPlayer.get(2));
        System.out.println("Ex = "+ ListPlayer.indexOf(p3));
    }
}

