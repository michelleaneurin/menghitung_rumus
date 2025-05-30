import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Number : ");
        int num = Input.nextInt();

        System.out.println("______________ FOR LOOP");
        for( int i = 1 ; i <= num; i++ ){
            System.out.print( i + " ");
        }

        System.out.println("\n____________-FOR WHILE");
        int i = 1;
        while ( i <= num) {
            System.out.print( i + " ");
            i++;
        }

        System.out.println("\n_____________- FOR DO-WHILE");
        i = 1;
        do{
            System.out.print( i + " ");
            i ++;
        } while ( i <= num);
    }
    
}
