public class NhanVien {

    public  String ma , name , gt , ns , address , phone , nkhd;


    public NhanVien(String ma , String name , String gt , String ns , String address , String phone , String nkhd){
        this.ma = ma;
        this.name = name;
        this.gt = gt;
        this.ns = ns;
        this.address = address;
        this.phone = phone;
        this.nkhd =  nkhd;
    }

    public void setNs(String ns) {
        this.ns = ns;
    }

    public String getNs() {
        return ns;
    }

    public void ChuanHoaNgaySinh(){
        if (this.ns.charAt(1) == '/'){
            this.ns = "0" + this.ns;

        }

        if (this.ns.charAt(4) == '/'){
            this.ns = this.ns.substring(0 , 3) + "0" + this.ns.substring(3);
        }

    }

    @Override
    public String toString(){
        return  ma + " " + name + " " + gt + " " + ns + " " + address + " " + phone + " " + nkhd;
    }
}
