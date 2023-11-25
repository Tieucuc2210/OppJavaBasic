import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = Integer.parseInt(cs.nextLine());
        ArrayList<SinhVien> a= new ArrayList<>();
        for (int i =0 ;i < n ;i++){
            String name = cs.nextLine();
            String gt = cs.nextLine();
            String ns = cs.nextLine();
            String dc = cs.nextLine();
            String mst = cs.nextLine();
            String nkhd = cs.nextLine();

            SinhVien z = new SinhVien(name , gt , ns , dc , mst , nkhd);
            z.ChuanHoa();
            a.add(z);
        }
        Collections.sort(a , new sortDay());
        for (SinhVien x : a){
            System.out.println(x);
        }
    }
}