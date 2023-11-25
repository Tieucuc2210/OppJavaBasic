import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = Integer.parseInt(cs.nextLine());
        ArrayList<MatHang> a= new ArrayList<>();
        for (int i = 0 ;i < n ;i++){
            String name = cs.nextLine();
            String donvi = cs.nextLine();
            int giaban = Integer.parseInt(cs.nextLine());
            int giamua = Integer.parseInt(cs.nextLine());

            MatHang z = new MatHang(name , donvi , giaban , giamua);
            a.add(z);
        }
//        Collections.sort(a, new Comparator<MatHang>() {
//            @Override
//            public int compare(MatHang o1, MatHang o2) {
//                if (o1.cuoicung() < o2.cuoicung()) return -1;
//                else return 1;
//            }
//        });

        Collections.sort(a , new SortMH());
        for (MatHang x : a){
            System.out.println(x);
        }
    }
}