import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        String name = cs.nextLine();
        String gt = cs.nextLine();
        String ns = cs.nextLine();
        String address = cs.nextLine();
        String phone = cs.nextLine();
        String nkhd = cs.nextLine();
        NhanVien a = new NhanVien("0001" , name , gt , ns , address , phone , nkhd);

        a.ChuanHoaNgaySinh();



        System.out.println(a);
    }
}