import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = Integer.parseInt(cs.nextLine());
        ArrayList<SinhVien> a = new ArrayList<>();
        for (int i =0 ;i < n ; i++){
            String ma = cs.nextLine();
            String name = cs.nextLine();
            String lop = cs.nextLine();
            String email = cs.nextLine();

            SinhVien x = new SinhVien(ma , name , lop , email);
            x.ChuanHoa();
            a.add(x);
        }


        int t = Integer.parseInt(cs.nextLine());
        while (t-- > 0){
            String se = cs.nextLine();
            System.out.println("DANH SACH SINH VIEN " + se + "La : ");
            for (SinhVien x : a){
                if (x.getLop().equals(se)){
                    System.out.println(x);
                }
            }
        }
    }
}