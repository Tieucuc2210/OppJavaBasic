import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        String ma = cs.nextLine();
        String name = cs.nextLine();
        float toan = cs.nextFloat();
        float li = cs.nextFloat();
        float hoa = cs.nextFloat();

        SinhVien a = new SinhVien(ma , name , toan , li , hoa);
        a.ans();
    }
}