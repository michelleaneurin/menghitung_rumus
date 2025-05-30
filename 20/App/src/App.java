class data{
    public int dataIntPub;
    private int dataIntPriv;
    data(){
        dataIntPub = 10;
        dataIntPub = 100;
    }
    // getter
    public int GetdataIntPriv(){
        return this.dataIntPriv;
    }
    //setter 
    public void SetdataIntPriv( int dataIntPriv ){
        this.dataIntPriv = dataIntPriv;
    }
}

public class App {
    public static void main(String[] args) {
        data obj = new data();
        System.out.println("data public = " + obj.dataIntPub);
        obj.dataIntPub = 15;
        System.out.println("2 data public = " + obj.dataIntPub);    
        System.out.println(" data private = " + obj.GetdataIntPriv());
        obj.SetdataIntPriv(70);
        System.out.println("2 data private = "+obj.GetdataIntPriv());   
    }
}
