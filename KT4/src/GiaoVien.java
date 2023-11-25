public class GiaoVien extends Person{

    public String khoa, luong , lopp;

    public GiaoVien(String ma , String name , String ns , String dc , String khoa , String luong , String lopp){
        super(ma , name , ns , dc);
        this.khoa = khoa;
        this.luong = luong;
        this.lopp = lopp;
    }

    @Override
    public String toString(){
        return super.toString() + " " + khoa + " " + luong + " " + lopp;
    }
}
