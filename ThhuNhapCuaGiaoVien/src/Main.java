import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        String ma = cs.nextLine();
        String Name = cs.nextLine();
        int luong = cs.nextInt();
        GiaoVien a= new GiaoVien(ma , Name , luong);
        System.out.println(a);
    }
}