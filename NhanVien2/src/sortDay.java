import java.util.Comparator;

public class sortDay implements Comparator<SinhVien> {
    @Override
    public  int compare(SinhVien o1 , SinhVien o2){
         int res = o1.getNs().compareTo(o2.getNs());
         if (res == 0){
             return o1.getMa().compareTo(o2.getMa());
         }
         return res;
    }
}
