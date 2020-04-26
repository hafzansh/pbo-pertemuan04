
public class hitungNilai {
    public static void main(String[] args){
        String nama[] = {"Hafiz","Nisha","Hanif","Rizky","Jinny"};
        int nilai1[] = {80,75,70,65,40},nilai2[] = {95,75,60,70,50};
        double[] rata = new double[5];
        
        System.out.println("------------------------------------------------------------");
        System.out.println("| No. |         Nama         | Test 1 | Test 2 | Rata-rata |");
        System.out.println("------------------------------------------------------------");
        
        for (int i = 0 ; i < 5; i++){		
            rata[i] = (nilai1[i] + nilai2[i]) / 2;
            int no = i+1;
            System.out.println("   " + no + "            " + nama[i] + "            " + nilai1[i] + "       " + nilai2[i] + "        " + rata[i]);
        }
    }
}