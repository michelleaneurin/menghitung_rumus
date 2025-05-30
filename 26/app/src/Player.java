public class Player {
    // 1. variabel ( name : TP, String  ) : private,
    // constractor : 
    // function : display, :menampilkan nama 

        private String name;
        Player(String name) {
            this.name = name;
        }
        public void Display() {
            System.out.println("Nama : " + this.name);
        }
        public String getName() {
            return name;
        }
        public boolean equals(Object otherobject){
            if ( this == otherobject){
                System.out.println("object dengan references sama");
                return true;
            } else if (this.getClass()  == otherobject.getClass()){
                System.out.println("object dengan class sama ");
                System.out.println("references berbeda");

                Player other = (Player) otherobject;

                if (this.name == other.name){
                    System.out.println("nama sama");
                    return true;
                }else{
                    System.out.println("nama sama");
                    return true;
                }
            }
            else{
                return false;
            }
        }
    }

    
    