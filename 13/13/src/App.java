import java.util.*;
public class App {
    public static void main(String[] args)  {
        Scanner Inputan = new Scanner(System.in);
        int num = Inputan.nextInt();
        System.out.println("Hasil Fib : "+Fib(num));
    }

    private static int Fib( int x ){
        return Fib( x - 1) + Fib(x-2);
    }
    }

