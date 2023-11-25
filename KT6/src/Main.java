import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = Integer.parseInt(cs.nextLine());

        ArrayList<GiaoVien> a= new ArrayList<>();
        ArrayList<SinhVien>b = new ArrayList<>();

        for (int i =0 ;i < n ;i++){
            String ma = cs.nextLine();
            if (ma.startsWith("GV")){
                String name = cs.nextLine();
                String ns = cs.nextLine();
                String dc = cs.nextLine();
                String khoa = cs.nextLine();
                String luong = cs.nextLine();
                String lopp = cs.nextLine();


                GiaoVien x = new GiaoVien(ma , name , ns , dc , khoa , luong , lopp);
                x.ChuanHoa();
                a.add(x);
            } else{
                String name = cs.nextLine();
                String ns = cs.nextLine();
                String dc = cs.nextLine();
                String lop = cs.nextLine();
                double gpa = Double.parseDouble(cs.nextLine());

                SinhVien x = new SinhVien(ma , name , ns, dc , lop , gpa);
                x.ChuanHoa();
                b.add(x);
            }
        }
        String test = cs.nextLine();
        System.out.println("DANH SACH CHU NHIEM LOP" + test + ": ");

        for(GiaoVien x : a){
            if (x.getLopp().equals(test)){
                System.out.println(x);
            }
        }
        System.out.println("DANH SACH SINH VIEN LOP" + test + ": ");
        for (SinhVien x : b){
            if (x.getLop().equals(test)){
                System.out.println(x);
            }
        }
    }
}