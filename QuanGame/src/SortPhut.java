import java.util.Comparator;

public class SortPhut implements Comparator<TinhGio> {
    @Override
    public int compare(TinhGio o1 , TinhGio o2){
        if (o1.Choi() != o2.Choi()) {
            if (o1.Choi() < o2.Choi()) return 1;
            else return  -1;
        } else{
            return o1.getTk().compareTo(o2.getTk());
        }
    }
}
