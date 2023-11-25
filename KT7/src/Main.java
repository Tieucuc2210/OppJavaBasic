import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = Integer.parseInt(cs.nextLine());
        ArrayList<Chung> a= new ArrayList<>();
        ArrayList<Chung>b =new ArrayList<>();

        for (int i =0 ;i < n ;i++){
            String ma = cs.nextLine();
            if (ma.startsWith("XM")){
                String name = cs.nextLine();
                String hang = cs.nextLine();
                String mausac = cs.nextLine();
                int tocdo = Integer.parseInt(cs.nextLine());
                int giaban1 = Integer.parseInt(cs.nextLine());

                XeMay x = new XeMay(ma , name , hang , mausac , tocdo , giaban1);
                a.add(x);
            } else{
                String name = cs.nextLine();
                String hang = cs.nextLine();
                String mausac = cs.nextLine();
                int maluc = Integer.parseInt(cs.nextLine());
                int giaban2 = Integer.parseInt(cs.nextLine());
                Oto x  = new Oto(ma , name , hang , mausac , maluc , giaban2);
                b.add(x);
            }
        }
        String hang = cs.nextLine();
        System.out.println("danh sach hang " + hang + ":");
        for (Chung x : a){
            if(x.getHang().equals(hang)) System.out.println(x);
        }
        for (Chung x : b){
            if (x.getHang().equals(hang)) System.out.println(x);
        }
    }
}