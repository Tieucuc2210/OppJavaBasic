import java.util.Comparator;

public class SortGpa implements Comparator<SinhVien> {

    @Override
    public int compare(SinhVien o1 , SinhVien o2){
        if (o1.getGpa() != o2.getGpa()){
            if (o1.getGpa() > o2.getGpa()) return -1;
            else return 1;
        } else {
            return o1.getMa().compareTo(o2.getMa());
        }
    }

}
