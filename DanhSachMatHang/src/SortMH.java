import java.util.Comparator;

public class SortMH implements Comparator<MatHang> {
    @Override
    public int compare(MatHang o1 , MatHang o2 ){
        if (o1.cuoicung() < o2.cuoicung()) return -1;
        else return 1;
    }
}
