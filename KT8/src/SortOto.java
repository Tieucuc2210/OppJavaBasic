import java.util.Comparator;

public class SortOto implements Comparator<OTO>
{
    @Override
    public int compare(OTO o1 , OTO o2){
        if (o1.getGiaban1() != o2.getGiaban1()){
            if (o1.getGiaban1() < o2.getGiaban1()) return  1;
            else return -1;
        } else{
            return o1.getMa().compareTo(o2.getMa());
        }
    }
}
