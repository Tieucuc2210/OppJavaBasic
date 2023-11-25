import java.util.Comparator;

public class SortXeMay implements Comparator<XeMay> {
    @Override
    public int compare(XeMay o1 , XeMay o2){
        if (o1.getGiaban2() != o2.getGiaban2()){
            if (o1.getGiaban2() < o2.getGiaban2()) return  1;
            else return -1;
        } else{
            return o1.getMa().compareTo(o2.getMa());
        }
    }
}
