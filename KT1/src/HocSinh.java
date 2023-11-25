public class HocSinh extends GiaoVien{

    private static int dem = 1;
    public String ma , lop;
    public float gpa;

    public HocSinh( String name , String ns , String dc , String lop , float gpa ){
        super(name , ns , dc);
        this.ma = check();
        this.lop = lop;
        this.gpa = gpa;

    }

    private String check(){
        String tmp = String.format("%04d" , dem);
        dem++;
        return tmp;
    }

    @Override
    public String toString(){
        return ma + " " + super.toString() + " " + lop + " " + String.format("%.2f" , gpa);
    }
}
