import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cs =new Scanner(System.in);
        ArrayList<SinhVien> a= new ArrayList<>();
        int n = cs.nextInt();
        cs.nextLine();
        for (int i =0 ;i < n ;i++){
            String name = cs.nextLine();
            String lop = cs.nextLine();
            String ns = cs.nextLine();
            float gpa = cs.nextFloat();
            cs.nextLine();
            SinhVien z= new SinhVien(name , lop , ns , gpa);
            z.ChuanHoa();
            a.add(z);
        }
        for (SinhVien x : a){
            System.out.println(x);
        }
    }
}