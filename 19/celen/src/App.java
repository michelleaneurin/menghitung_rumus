import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Masukkan level (L1, L2, L3, L4): ");
        String level = scanner.nextLine().toUpperCase(); 

        int points = getPoints(level);

    
        if (points != Integer.MIN_VALUE) { 
            System.out.println("Level: " + level);
            System.out.println("Points: " + points);
        }
    }

    public static int getPoints(String level) {
        switch (level) {
            case "L1":
                return 0; 
            case "L2":
                return 20; 
            case "L3":
                return -20; 
            case "L4":
                return 60; 
            default:
                System.out.println("Level tidak valid! Silakan coba lagi.");
                return Integer.MIN_VALUE; 
        }
    }
}