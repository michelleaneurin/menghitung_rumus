import java.util.Scanner;
public class Faktorial {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Number_Michelle: "); //4_michelle
        String inputStr = input.nextLine();

        
        String[] parts = inputStr.split("_");

        if (parts.length == 2 && parts[1].equals("michelle")) {
            try {
               
                int num = Integer.parseInt(parts[0]);

            
                System.out.println("_");

                
                int factorial = 1;
                for (int i = 1; i <= num; i++) {
                    factorial *= i;
                }

                System.out.println("Faktorial dari " + num + " adalah " + factorial);

            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid. Pastikan formatnya benar.");
            }
        } else {
            System.out.println("Format input tidak valid. Harus berformat num_michelle.");
        }

        input.close();
    }
}