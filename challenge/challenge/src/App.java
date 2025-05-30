import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    
        System.out.print("Number_Michelle: ");
        String inputStr = input.nextLine();

      
        String[] parts = inputStr.split("_");

        if (parts.length == 2 && parts[1].equals("michelle")) {
            try {
                
                int num = Integer.parseInt(parts[0]);

               
                System.out.println("_");

                
                int min = Integer.MAX_VALUE;
                int max = Integer.MIN_VALUE;
                int total = 0;
                int count = 0;

                
                for (int i = 1; i <= num; i++) {
                    System.out.print("Number ke-" + i + ": ");
                    int value = input.nextInt();

                    
                    total += value;

                   
                    if (value < min) {
                        min = value;
                    }

                    
                    if (value > max) {
                        max = value;
                    }
                   
                    
                    count++;
                }

                
                double average = (double) total / count;

                System.out.println("Nilai Minimum = " + min);
                System.out.println("Nilai Maksimum = " + max);
                System.out.println("Total = " + total);
                System.out.println("Rata-rata = " + average);

            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid. Pastikan formatnya benar.");
            }
        } else {
            System.out.println("Format input tidak valid. Harus berformat num_michelle.");
        }
        
        input.close();
    }
}