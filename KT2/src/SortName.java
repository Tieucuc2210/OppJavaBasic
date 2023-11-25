import java.util.Comparator;

public class SortName implements Comparator<Person> {
    @Override
    public int compare(Person o1 , Person o2){
        return o1.getSortName().compareTo(o2.getSortName());
    }
}
