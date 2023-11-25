import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cs= new Scanner(System.in);
        ArrayList<GiaoVien> a = new ArrayList<>();
        int n = Integer.parseInt(cs.nextLine());
        for (int i = 0 ; i < n ;i++){
            String name = cs.nextLine();
            String ns = cs.nextLine();
            String dc = cs.nextLine();
            String lop = cs.nextLine();
            float gpa = Float.parseFloat(cs.nextLine());

            HocSinh z = new HocSinh(name , ns , dc , lop , gpa);
            z.ChuanHoa();
            a.add(z);
        }
        for (GiaoVien x : a){
            System.out.println(x);
        }
    }
}