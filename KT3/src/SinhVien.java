public class SinhVien extends Person {


    public String lop;
    public float gpa;

    public SinhVien(String ma , String ten , String ns , String dc , String lop , float gpa){
        super(ma , ten , ns ,dc);
        this.lop = lop;
        this.gpa = gpa;
    }

    @Override
    public String toString(){
        return super.toString() + " " +  lop + " " + gpa;
    }
}
