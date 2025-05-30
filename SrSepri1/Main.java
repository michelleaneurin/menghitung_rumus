
import java.util.ArrayList;

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

        Player1[] DataPlayer = new Player1[2];
        DataPlayer[0] = p1;
        DataPlayer[1] = p2;
        DataPlayer[2] = p3;
        DataPlayer[3] = p4;

        for(Player1 p:DataPlayer){
            p.display();
        }
    }
}
