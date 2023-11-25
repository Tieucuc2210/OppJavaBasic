import java.util.Comparator;

public class Sort implements Comparator<LOp> {
    @Override
    public int compare(LOp o1 , LOp o2){
        if (o1.getLop() != o2.getLop()){
            if (o1.getLop() < o2.getLop()) return -1;
            else return  1;
        } else{
            return  o1.getMa().compareTo(o2.getMa());

        }
    }

}
