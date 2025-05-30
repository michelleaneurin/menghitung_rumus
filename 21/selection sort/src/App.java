public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
func selectionsort (var ar as array)
     for j from 0 to length(ar)-1
        loc i from j to length(ar)-1
    if (ar[loc_selected] > ar[i])
                    loc_selected = i 
                    end if 
    end for
swap (ar[j], ar[loc_seletced])
end for
end func

    }

    
}


import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Masukkan jumlah elemen: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        
        System.out.println("Masukkan " + n + " angka:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Array sebelum sorting:");
        printArray(arr);

        System.out.print("banyak pertukaran yang terjadi: ");
        int userGuess = scanner.nextInt();

        
        int actualSwaps = selectionSort(arr);

        System.out.println("Array setelah sorting:");
        printArray(arr);
        System.out.println("Jumlah swap yang benar: " + actualSwaps);

        if (userGuess == actualSwaps) {
            System.out.println("Selamat! Tebakanmu benar ");
        } else {
            System.out.println("Sayang sekali, tebakanmu salah ");
        }

        scanner.close();
    }

    public static int selectionSort(int[] arr) {
        int swaps = 0;
        int n = arr.length;
        for (int j = 0; j < n - 1; j++) {
            int loc_selected = j;
            for (int i = j + 1; i < n; i++) {
                if (arr[loc_selected] > arr[i]) {
                    loc_selected = i;
                }
            }
           
            if (loc_selected != j) {
                int temp = arr[j];
                arr[j] = arr[loc_selected];
                arr[loc_selected] = temp;
                swaps++; 
            }
        }
        return swaps;
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}