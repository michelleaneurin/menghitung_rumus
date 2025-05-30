abstract class a
{
    public int a;
    abstract public void set(int a);
    abstract final public void get();
}

class b extends a
{
    public void set(int a)
    {
        this.a = a;
    }
    public void get()
    {
        System.out.println("a = " + a);;
    }
}

public class App {
    public static void main(String[] args) 
    {
        b obj = new b();
        obj.set(20);
        obj.get();   
    }
}


// ini salah semua
// abstarct class tidak boleh memilkiki conctructor
// subclass dari abstarct class tidak bisa overrude
//  abstark klass tidak holeh memakai atribut 

// unterplace bis amengimplementasikan banyak abstark