public class Statement {
    public static void main(String[] args) {
        var nilai = 88;
        var present = 90;
        String nilai_inf; 
        System.out.println("__________ : IF STATEMENT");

        if(nilai >= 80 && present >= 85 ){
            if((nilai > 100) || (present > 100) ){
                nilai_inf = "E";
            }
            else{
            nilai_inf = "A";
        }
        }
        else if( nilai >=70 && present >= 75 ){
            nilai_inf = "B";
        }
        else if( nilai >= 60 && present >=65){
            nilai_inf = "C";
        }
        else if( nilai >= 50 && present >=55){
            nilai_inf = "D";
        }
        else{
            nilai_inf = "E";
        }
        System.out.println("nilai informatika = " +nilai_inf);
    }
}

    String nilai_inf1 = "A";
    System.out.println("____________ : SWITCH STOATEMENT : YIELD");
    status = switch (nilai_inf1){
        case "A" : yield "memilih jurusan yang sangat tepat";
        case "B" : yield "memilih jurusan yang  tepat";
        case "C" : yield "memilih jurusan yang  tepat";
    }
