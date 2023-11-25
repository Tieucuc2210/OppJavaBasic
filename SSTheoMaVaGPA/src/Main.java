import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = Integer.parseInt(cs.nextLine());
        ArrayList<SinhVien> a= new ArrayList<>();
        for (int i =0 ;i < n ;i++){
            String name = cs.nextLine();
            String ns = cs.nextLine();
            String lop = cs.nextLine();
            float gpa = Float.parseFloat(cs.nextLine());
            SinhVien p = new SinhVien(name , ns , lop , gpa);
            p.ChuanHoa();
            a.add(p);
        }

//        Collections.sort(a, new Comparator<SinhVien>() {
//            @Override
//            public int compare(SinhVien o1, SinhVien o2) {
//                if (o1.getGpa() != o2.getGpa()){
//                    if (o1.getGpa() > o2.getGpa()) return -1;
//                    else return 1;
//                } else{
//                    return o1.getMa().compareTo(o2.getMa());
//                }
//
//            }
//        });
        Collections.sort(a , new SortGpa());
        for (SinhVien x : a){
            System.out.println(x);
        }
    }
}