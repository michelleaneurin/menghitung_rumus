class BubbleSortAsc{
    BubbleSortAsc(int data[] ){
        for( int k = 0; k < data.length; k++){
            for( int i = 0; i < (data.length -1); i ++ ){
                int newData = data[ i ];
                if( data[ i ] > data [i + 1]){
                    data[ i ] = data [i + 1];
                    data[ i+1 ] = newData;
                }
            }
        }
        for( int i : data){
            System.out.println(i + " ");
        }
    }
}
public class App {
    public static void main(String[] args) {
        int[] data = {100,10,11,5,8};
        BubbleSortAsc obj1 = new BubbleSortAsc (data);
        String kata1 ="abc";//-
        String kata2 ="zdf";//+
        System.out.println( kata1 > kata2 );
    }
}
