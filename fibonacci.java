
public class fibonacci {
    public static void main(String[] args){
        int max = 9, awal = 0, kedua = 1, fibonacci=0;	
        for ( int i = 0 ; i <= max ; i++ ) {		    
            fibonacci = awal + kedua;
            awal = kedua;
            kedua = fibonacci;		    
            System.out.print(fibonacci + " ");
        }
    }
}