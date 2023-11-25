import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = Integer.parseInt(cs.nextLine());
        ArrayList<LOp> a = new ArrayList<>();
        for (int i =0 ; i < n ;i++){
            String ma = cs.nextLine();
            String name = cs.nextLine();
            String lop = cs.nextLine();
            String emal = cs.nextLine();

            LOp p = new LOp(ma , name , lop , emal);
            a.add(p);
        }
        Collections.sort(a , new Sort());
        for (LOp x : a){
            System.out.println(x);
        }
    }
}