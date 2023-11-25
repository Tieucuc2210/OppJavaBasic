import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cs= new Scanner(System.in);
        int n = Integer.parseInt(cs.nextLine());
        ArrayList<OTO> a= new ArrayList<>();
        ArrayList<XeMay> b = new ArrayList<>();

        for (int i =0 ;i < n ;i++){
            String ma = cs.nextLine();
            if (ma.startsWith("OTO")){
                String name = cs.nextLine();
                String hang = cs.nextLine();
                String mausac= cs.nextLine();
                int maluc = Integer.parseInt(cs.nextLine());
                int giaban1 = Integer.parseInt(cs.nextLine());

                OTO x = new OTO(ma , name , hang , mausac , maluc , giaban1);
                a.add(x);
            } else{
                String name = cs.nextLine();
                String hang = cs.nextLine();
                String mausac = cs.nextLine();
                int tocdo = Integer.parseInt(cs.nextLine());
                int giaban2 = Integer.parseInt(cs.nextLine());

                XeMay x = new XeMay(ma , name , hang , mausac , tocdo , giaban2);
                b.add(x);
            }
        }
        System.out.println("Danhsach oto");
        Collections.sort(a , new SortOto());
        for (OTO x : a){
            System.out.println(x);
        }
        Collections.sort(b , new SortXeMay());
        System.out.println("danh sach xe mayu");
        for (XeMay x : b){
            System.out.println(x);
        }
    }
}