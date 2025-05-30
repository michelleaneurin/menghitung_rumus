public class App {
  public static void main(String[] args) {
      System.out.println("____________ Char & String");
      char isChr = 'a';
      String isString = "IPAA1";
      System.out.println("char = " + isChr + " String = " + isString);

      System.out.println("____________ Boolean");
      boolean t = true; // Perbaiki kesalahan penulisan 'booelan' menjadi 'boolean'
      boolean f = false;
      System.out.println("T = " + t + " F = " + f);

      System.out.println("____________ var & Final");
      byte isByte = 120;
      var isVar = 121; // 'var' digunakan dengan tipe data yang sudah ada
      var isVarf = 12.1; // inferensi tipe otomatis (double)
      var isVarStr = "javac"; // inferensi tipe otomatis (String)
      
      isVar = 212; // Memperbarui nilai variabel yang dideklarasikan dengan 'var'
      final int isFinal = 15; // 'final' diletakkan sebelum tipe data dan harus diinisialisasi
      // isFinal = 515; // Ini akan menyebabkan error karena variabel final tidak dapat diubah setelah inisialisasi

      System.out.println("_______________ Assigment Operator");
      /*
       +=
       -=
       *=
       /=
       %=
      */
      var G = 4; // 'var' digunakan dengan tipe data yang sudah ada
      System.out.println("1G = " + G);
      G += 2; // Operator penugasan
      System.out.println("2G = "+G);

      System.out.println("_____________ UNARY Operator");
      // +-
      byte abc = 12;
      System.out.println( "abc -12 :" + -abc);
      System.out.println( "abc -12 :" + +abc);
      //Decrement : Post & Pre 
      // pre -  Decrement
      byte isDec = 10;
      System.out.printf("pre-Decrement : %d ", + ++isDec );
      // post - Decrement
      byte isPost = 20;
      System.out.printf("\n1pre-Decrement :  %d ", isPost++ );
      System.out.printf("\n2pre-Decrement :  %d ", isPost );
      //Increment (-) : Post & Pre
      System.out.printf("\npre-Decrement :  %d ", --isPost );
      System.out.printf("\n2pre-Decrement :  %d ", isPost-- );
      System.out.printf("\n2pre-Decrement :  %d ", isPost );

  }
}