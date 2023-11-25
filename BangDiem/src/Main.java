import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = Integer.parseInt(cs.nextLine());
        ArrayList<BangDiem> a = new ArrayList<>();
        for (int i =0 ; i < n ;i++){
            String name = cs.nextLine();
            ArrayList<Double> z = new ArrayList<>();
            for (String s : cs.nextLine().split(" ")){
                try {
                    z.add(Double.parseDouble(s));
                } catch (NumberFormatException ex){
                    System.out.println("loi" + ex.getMessage());
                }
            }
            BangDiem x = new BangDiem(name , z);
            a.add(x);

        }
        Collections.sort(a ,new SortDiem());
        for (BangDiem x : a){
            System.out.println(x);
        }

    }
}