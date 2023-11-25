public class SinhVien {

    private static  int dem =1;
    public String ma , name , gt , ns , dc , mst , nkhd;

    public SinhVien(String name , String gt , String ns , String dc , String mst , String nkhd){
        this.ma = check();
        this.name = name;
        this.gt = gt;
        this.ns = ns;
        this.dc = dc;
        this.mst = mst;
        this.nkhd = nkhd;
    }

    private String check(){
        String t = String.format("%05d" , dem);
        dem++;
        return  t;
    }

    public void ChuanHoa(){
        if (this.ns.charAt(1) == '/'){
            this.ns = "0" + this.ns;
        }
        if (this.ns.charAt(4) == '/'){
            this.ns = this.ns.substring(0 , 3)  + "0" + this.ns.substring(3);
        }
    }
    @Override
    public String toString(){
        return ma + " " + name + " "  + gt + " " + ns + " " + dc + " " + mst + " " + nkhd;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getNs() {
        return ns;
    }

    public void setNs(String ns) {
        this.ns = ns;
    }
}
