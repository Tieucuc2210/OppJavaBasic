import java.util.Comparator;

public class SortDiem implements Comparator<BangDiem> {
    @Override
    public int compare(BangDiem o1 , BangDiem o2){
        double t1 = o1.TinhDiem();
        double t2 = o2.TinhDiem();
        if (t1 == t2){
            return o1.getMa().compareTo(o2.getMa());
        } else{
            return  -Double.compare(t1 , t2);
        }
    }

}
