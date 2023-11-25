import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cs= new Scanner(System.in);
        String name = cs.nextLine();
        int luong = cs.nextInt();
        int ngay = cs.nextInt();
        String chucvu = cs.nextLine();

        NhanVien a = new NhanVien("NV001" , name , luong , ngay , chucvu);
        System.out.println(a);
    }
}