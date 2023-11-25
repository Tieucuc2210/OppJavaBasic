public class SinhVien {
    private static int dem = 1;
    public String ma , name , lop , ns;
    public float gpa;

    public  SinhVien(){
        ma = check();
        name = "";
        lop = "";
        ns = "";
        gpa = 0;
    }
    public SinhVien( String name , String lop , String ns , float gpa){
        this.ma = check();
        this.name = name;
        this.lop = lop;
        this.ns = ns;
        this.gpa = gpa;
    }

    private String check(){
        String p = String.format("%03d" , dem);
        dem++;
        return "SV" + p;
    }
    public void ChuanHoa(){
        if (this.ns.charAt(1) == '/'){
            this.ns = "0" + this.ns;
        }
        if (this.ns.charAt(4) == '/'){
            this.ns = this.ns.substring(0 , 3) + "0" + this.ns.substring(3);
        }
    }

    @Override
    public String toString(){
        return String.format("%s %s %s %s %.2f" , ma , name , lop , ns , gpa);
    }
}
