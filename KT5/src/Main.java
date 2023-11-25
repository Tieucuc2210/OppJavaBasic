import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cs= new Scanner(System.in);
        int n = Integer.parseInt(cs.nextLine());
        ArrayList<GiaoVien> a= new ArrayList<>();
        ArrayList<SinhVien> b = new ArrayList<>();

        for (int i =0 ;i < n ;i++){
            String ma = cs.nextLine();
            if (ma.startsWith("GV")){
                String name = cs.nextLine();
                String ns = cs.nextLine();
                String dc = cs.nextLine();
                String khoa = cs.nextLine();
                int luong = Integer.parseInt(cs.nextLine());

                GiaoVien x = new GiaoVien(ma , name , ns , dc , khoa , luong);
                x.ChuanHoa();
                a.add(x);

            } else {
                String name = cs.nextLine();
                String ns = cs.nextLine();
                String dc = cs.nextLine();
                String lop = cs.nextLine();
                double gpa = Double.parseDouble(cs.nextLine());

                SinhVien x = new SinhVien( ma ,name , ns , dc ,lop , gpa);
                x.ChuanHoa();
                b.add(x);
            }
        }
        Collections.sort(a , new SortBVBytLuong());
        System.out.println("danh sach giao vien");
        for (Person x : a){
            System.out.println(x);
        }
        Collections.sort(b , new SortByGpa());
        System.out.println("danh sahc sinh vien");
        for (Person x: b){
            System.out.println(x);
        }

    }
}