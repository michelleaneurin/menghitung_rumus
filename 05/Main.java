public class Main {
    public static void main (String[] args) {
        int[] valuesToCheck = {2, 90, 100, 50, 102};  
        
        for (int value : valuesToCheck) {
            System.out.println("Nilai: " + value + " -> " + checkValue(value));
        }
    }
    
    public static boolean checkValue(int value) {
        return (value >= 1 && value <= 3) || (value >= 88 && value <=101);
}
}
