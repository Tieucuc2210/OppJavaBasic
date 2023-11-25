import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cs= new Scanner(System.in);
        int n = Integer.parseInt(cs.nextLine());
        ArrayList<TinhGio> a = new ArrayList<>();
        for (int i =0 ;i < n ;i++){
            String tk = cs.nextLine();
            String mk = cs.nextLine();
            String name = cs.nextLine();
            String den = cs.nextLine();
            String di = cs.nextLine();
            TinhGio z = new TinhGio(tk , mk , name , den , di);
            a.add(z);
        }
        Collections.sort(a , new SortPhut());
        for (TinhGio x : a){
            System.out.println(x);
        }
    }
}