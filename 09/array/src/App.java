public class App {
    public static void main(String[] args) {
        System.out.println("_________- ARRAY -1");
        String[] arrayString = new String[3];
        // diatas sering disebut memory stack
        arrayString[0] = "michelle";
        arrayString[1] = "ima";
        // arrayString[2] = "mimi";
        System.out.println(arrayString);
        System.out.println("data - 0 " + arrayString[0]);
        System.out.println("data - 1 " + arrayString[1]);
        System.out.println("data - 2 " + arrayString[2]);
        
        System.out.println("_________- ARRAY -2");
        Byte [] arraByte = new Byte[] {
            1,2,3,4
        };
        //  diatas sering disebut memory heap
        System.out.println("data - 0 " + arrayString[0]);
        System.out.println("data - 1 " + arrayString[1]);
        System.out.println("data - 2 " + arrayString[2]);
        
        System.out.println("_________- ARRAY -3");
        int[] arrayInt = {
            4,3,2,1
        };
        System.out.println("data - 0 " + arrayInt[0]);

        System.out.println("_________ PANJANG ARRAY ");
        System.out.println("PANJANG ARRAY =  " + arrayInt.length);

        System.out.println("_________ FOR LOOP - ARRAY ");
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.println("data ke-" + (i+1) + " = " + arrayInt(1)) ;
        }

        System.out.println("_________ FOR LOOP EACH - ARRAY ");
        for(int i : arrayInt ){
            System.out.println("Data = " + i);
        }
    }   
}
