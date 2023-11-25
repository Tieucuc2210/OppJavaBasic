import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cs= new Scanner(System.in);
        String name = cs.nextLine();
        String ns = cs.nextLine();
        float diem1 = cs.nextFloat();
        float diem2 = cs.nextFloat();
        float diem3 = cs.nextFloat();

        SinhViem a = new SinhViem(name , ns , diem1 , diem2 , diem3);
        System.out.println(a);

    }
}