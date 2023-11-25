import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = Integer.parseInt(cs.nextLine());
        ArrayList<NhanVien> a= new ArrayList<>();
        for (int i =0 ;i < n ;i++){
            String name = cs.nextLine();
            String gt = cs.nextLine();
            String ns = cs.nextLine();
            String dc = cs.nextLine();
            String mst = cs.nextLine();
            String nkhd = cs.nextLine();
            NhanVien p = new NhanVien(name , gt ,ns , dc  , mst , nkhd);
            p.ChuanHoa();
            a.add(p);

        }

        for (NhanVien x : a){
            System.out.println(x);
        }
    }
}