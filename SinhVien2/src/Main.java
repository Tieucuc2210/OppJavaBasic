import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        ArrayList<SinhhVien> a = new ArrayList<>();
        int n = cs.nextInt();
        cs.nextLine();
        ArrayList<String> test = new ArrayList<>();
        for (int i = 0 ;i < n ;i++){
            String name = cs.nextLine();
            String ns = cs.nextLine();
            String lop = cs.nextLine();
            float gpa = cs.nextFloat();
            cs.nextLine();
            SinhhVien p = new SinhhVien(name , ns , lop , gpa);
            p.NgaySinh();
            String ppp = p.getLop();
            test.add(ppp);
            a.add(p);
        }


        for (String x : test){
            System.out.println(x);
        }
//        for (SinhhVien x : a){
//            System.out.println(x);
//        }
    }
}