import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cs= new Scanner(System.in);
        int n = Integer.parseInt(cs.nextLine());
        ArrayList<SInhVien> a= new ArrayList<>();
        for (int i = 0 ;i < n ; i++){
            String ma = cs.nextLine();
            String name = cs.nextLine();
            String lop = cs.nextLine();
            String email = cs.nextLine();

            SInhVien p = new SInhVien(ma , name , lop , email);
            p.ChuanHoa();

            a.add(p);
        }

        int test = Integer.parseInt(cs.nextLine());
        while (test -- >0){
            int pp = cs.nextInt();
            System.out.println("danh sach khoa hoc : " + pp + " ");
            for (SInhVien x : a){
                if (x.getlop() == pp){
                    System.out.println(x);
                }
            }
        }
    }
}