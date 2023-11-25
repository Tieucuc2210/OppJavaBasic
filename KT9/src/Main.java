import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cs= new Scanner(System.in);
        int n = Integer.parseInt(cs.nextLine());
        ArrayList<Oto> a = new ArrayList<>();
        ArrayList<XeMay> b = new ArrayList<>();

        for (int i =0 ;i < n ;i++){
            String ma = cs.nextLine();
            if (ma.startsWith("OTO")){
                String name = cs.nextLine();
                String hang = cs.nextLine();
                String mausac = cs.nextLine();
                int maluc = Integer.parseInt(cs.nextLine());
                int giaban1 = Integer.parseInt(cs.nextLine());

                Oto x = new Oto(ma , name , hang , mausac , maluc , giaban1);
                a.add(x);
            } else{
                String name = cs.nextLine();
                String hang = cs.nextLine();
                String mausac = cs.nextLine();
                int tocdo = Integer.parseInt(cs.nextLine());
                int giaban2 = Integer.parseInt(cs.nextLine());

                XeMay x = new XeMay( ma , name , hang , mausac , tocdo , giaban2);
                b.add(x);
            }
        }
        int x = cs.nextInt();
        int y = cs.nextInt();
        System.out.println("danh sach o to la ");
        for (Oto c : a){
            if (c.getGiaban1() > x && c.getGiaban1() < y){
                System.out.println(c);
            }
        }

        System.out.println("danh sach xe may la ");
        for (XeMay c : b){
            if (c.getGiaban2() > x && c.getGiaban2() < y){
                System.out.println(c);
            }
        }
    }
}