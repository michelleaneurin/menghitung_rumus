import java.util.Scanner;
public class Prima {
    

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Number_michelle: ");//7_michelle
        String inputStr = input.nextLine();

        
        String[] parts = inputStr.split("_");

        if (parts.length == 2 && parts[1].equals("michelle")) {
            try {
                
                int num = Integer.parseInt(parts[0]);

               
                System.out.println("_");

                
                boolean isPrime = true;

                
                if (num <= 1) {
                    isPrime = false;
                } else {
                    
                    for (int i = 2; i <= Math.sqrt(num); i++) {
                        if (num % i == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                }

            
                if (isPrime) {
                    System.out.println(num + " adalah bilangan prima.");
                } else {
                    System.out.println(num + " bukan bilangan prima.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid. Pastikan formatnya benar.");
            }
        } else {
            System.out.println("Format input tidak valid. Harus berformat num_michelle.");
        }

        
        input.close();
    }
}
