import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner  cs = new Scanner(System.in);
        ArrayList<Person>a = new ArrayList<>();
        int n = Integer.parseInt(cs.nextLine());
        for (int i=0 ;i < n ;i++){
            String name = cs.nextLine();
            String ns = cs.nextLine();
            String dc  = cs.nextLine();
            String lop = cs.nextLine();
            float gpa = Float.parseFloat(cs.nextLine());

            Student p = new Student(name , ns , dc , lop , gpa);
            p.ChuanHoa();
            a.add(p);
        }

        Collections.sort(a , new SortName());
        for (Person x : a){
            System.out.println(x);
        }
    }
}