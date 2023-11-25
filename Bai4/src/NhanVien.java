public class NhanVien{
    public  String ma , name , gt , ns , dc , mst , nkhd;


    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGt() {
        return gt;
    }

    public void setGt(String gt) {
        this.gt = gt;
    }

    public String getNs() {
        return ns;
    }

    public void setNs(String ns) {
        this.ns = ns;
    }

    public String getDc() {
        return dc;
    }

    public void setDc(String dc) {
        this.dc = dc;
    }

    public String getMst() {
        return mst;
    }

    public void setMst(String mst) {
        this.mst = mst;
    }

    public String getNkhd() {
        return nkhd;
    }

    public void setNkhd(String nkhd) {
        this.nkhd = nkhd;
    }

    public NhanVien(String ma , String name , String gt , String ns , String dc , String mst , String nkhd) {
        this.ma = ma;
        this.name = name;
        this.gt = gt;
        this.ns = ns;
        this.dc = dc;
        this.mst = mst;
        this.nkhd = nkhd;

    }

    public void ChuanHoa(){
        if(this.ns.charAt(1) == '/'){
            this.ns = "0" + this.ns;
        }
        if (this.ns.charAt(4) == '/'){
            this.ns = ns.substring(0 , 3) + "0" + ns.substring(3);
        }

        //chuan hoa nkhd
        if (this.nkhd.charAt(1) == '/'){
            this.nkhd = "0" + nkhd;
        }
        if (this.nkhd.charAt(4) == '/'){
            this.nkhd = nkhd.substring(0 , 3) + "0" + nkhd.substring(3);
        }
    }

    @Override
    public String toString(){
        return ma + " " + name + " " + gt + " " + ns + " " + dc + " " + mst  + " " + nkhd;
    }
}
