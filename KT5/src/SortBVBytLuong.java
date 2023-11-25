import java.util.Comparator;

public class SortBVBytLuong implements Comparator<GiaoVien> {
    @Override
    public int compare(GiaoVien o1 , GiaoVien o2){
        if (o1.getLuong() != o2.getLuong()){
            if (o1.getLuong() < o2.getLuong()) return 1;
            else return  -1;
        } else{
            return o1.getMa().compareTo(o2.getMa());
        }
    }


}
