
class Sorting {
    protected int[] DATAint = {8,9,10,1,3,4,11,15,100,55,2,5,200};
    protected char[] DATAchar = {'v', 'b', 'a', 'z', 'v', 'c', 'f'};
    protected String[] DATAstring = {"CODING", "kelas", "XI", "IPA", "I"};

    public void displayData() {
        System.out.println("Data belum diurutkan.");
    }
}

class QuickSort extends Sorting {
    public QuickSort() {
        super(); 
    }

    public void sortAscending() {
       
    }

    public void sortDescending() {
      
    }
}


class InsertionSort extends Sorting {
    public InsertionSort() {
        super();
    }

    public void sortAscending() {
     
    }

    public void sortDescending() {
      
    }
}


public class Main {
    public static void main(String[] args) {
        QuickSort qs = new QuickSort();
        qs.sortAscending();
        qs.sortDescending();

        InsertionSort is = new InsertionSort();
        is.sortAscending();
        is.sortDescending();
    }
}

