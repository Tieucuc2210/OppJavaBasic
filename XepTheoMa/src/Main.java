import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        ArrayList<SinhVien> a= new ArrayList<>();
        for (int i =0 ;i < 4 ; i++){
            String ma = cs.nextLine();
            String name = cs.nextLine();
            String lop = cs.nextLine();
            String email = cs.nextLine();
            SinhVien p = new SinhVien(ma , name , lop , email);

            a.add(p);
        }
        Collections.sort(a, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return Integer.compare(o1.getMMa() , o2.getMMa());
            }
        });

        for (SinhVien x : a){
            System.out.println(x);
        }
    }
}