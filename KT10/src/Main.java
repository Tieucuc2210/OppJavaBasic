import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = Integer.parseInt(cs.nextLine());
        ArrayList<Chung> a= new ArrayList<>();
        ArrayList<Chung> b = new ArrayList<>();
        for (int i =0 ;i < n ;i++){
            String ma = cs.nextLine();
            if (ma.startsWith("OTO")){
                String name = cs.nextLine();
                String hang = cs.nextLine();
                String mausac = cs.nextLine();
                int maluc = Integer.parseInt(cs.nextLine());
                int gb1 = Integer.parseInt(cs.nextLine());

                Oto x = new Oto(ma ,name , hang , mausac , maluc , gb1);
                a.add(x);
            } else{
                String name = cs.nextLine();
                String hang = cs.nextLine();
                String mausac = cs.nextLine();
                int tocdo = Integer.parseInt(cs.nextLine());
                int gb2 = Integer.parseInt(cs.nextLine());

                Xemay x = new Xemay(ma , name , hang , mausac , tocdo , gb2);
                b.add(x);
            }
        }
        String test = cs.nextLine();
        System.out.println("Danh sach oto");
        for (Chung x : a){
            if (x.getName().equals(test)){
                System.out.println(x);
            }
        }
        System.out.println("danh sach xe may");
        for (Chung x : b){
            if (x.getName().equals(test)){
                System.out.println(x);
            }
        }
    }
}