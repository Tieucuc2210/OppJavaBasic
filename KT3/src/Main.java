import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cs= new Scanner(System.in);

        int n = Integer.parseInt(cs.nextLine());
        ArrayList<Person> a = new ArrayList<>();
        ArrayList<Person> b = new ArrayList<>();

        for (int i =0 ;i < n ;i++){
            String ma = cs.nextLine();
            if (ma.startsWith("GV")){
                String name = cs.nextLine();
                String ns = cs.nextLine();
                String dc = cs.nextLine();
                String lop = cs.nextLine();
                float gpa = Float.parseFloat(cs.nextLine());

                SinhVien pp = new SinhVien(ma , name , ns , dc , lop , gpa);
                pp.ChuanHoa();

                a.add(pp);
            } else {
                String name = cs.nextLine();
                String ns = cs.nextLine();
                String dc = cs.nextLine();
                String khoa = cs.nextLine();
                String luong = cs.nextLine();

                GiaoVien bb = new GiaoVien(ma , name , ns , dc , khoa , luong);
                bb.ChuanHoa();
                b.add(bb);
            }
        }

        System.out.println("DANH SACH GIAO VIEN");
        for (Person x : a){
            System.out.println(x);
        }

        System.out.println("DANH SACH HOC SINH");
        for(Person x : b){
            System.out.println(x);
        }

    }
}