import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = Integer.parseInt(cs.nextLine());
        ArrayList<Person>a = new ArrayList<>();
        ArrayList<Person> b = new ArrayList<>();

        for (int i =0 ;i < n ;i++){
            String ma = cs.nextLine();
            if (ma.startsWith("GV")){
                String name = cs.nextLine();
                String ns = cs.nextLine();
                String dc = cs.nextLine();
                String khoa = cs.nextLine();
                String luong = cs.nextLine();
                String lopp = cs.nextLine();
                GiaoVien pp = new GiaoVien(ma , name , ns , dc , khoa , luong , lopp);
                pp.ChuanHoa();
                a.add(pp);
            } else{
                String name = cs.nextLine();
                String ns = cs.nextLine();
                String dc = cs.nextLine();
                String lop = cs.nextLine();
                float gpa = Float.parseFloat(cs.nextLine());

                SinhVien pp = new SinhVien(ma , name , ns , dc , lop , gpa);
                pp.ChuanHoa();
                b.add(pp);
            }
        }

        System.out.println("DANH SACH GIAO VIEN CO DIA CHI O HA NOI");
        String test = cs.nextLine();
        for (Person x : a){
            if (x.getDc().equals(test)){
                System.out.println(x);
            }
        }
        System.out.println("DANH SACH SINH VIEN CO DIA CHO O HA NOi");
        for (Person x : b){
            if (x.getDc().equals(test)){
                System.out.println(x);
            }
        }
    }
}