public class NhanVien {
    private static int dem =1;
    public  String ma , name , gt , ns  , dc , mst , nkhd;

    public NhanVien(String name , String gt , String ns , String dc , String mst , String nkhd){
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
            this.ns = this.ns.substring(0 , 3) + "0" + this.ns.charAt(3);
        }

        if (this.nkhd.charAt(1) == '/'){
            this.nkhd = "0" + this.nkhd;
        }
        if (this.nkhd.charAt(4) == '/'){
            this.nkhd = this.nkhd.substring(0 , 3) + "0" + this.nkhd.substring(3);
        }

    }

    @Override
    public String toString(){
        return ma + " " + name + " " + gt + " " + ns + " " + dc + " " + mst + " " + nkhd;
    }
}
