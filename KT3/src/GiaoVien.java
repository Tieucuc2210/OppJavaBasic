public class GiaoVien extends Person{
    public String khoa , luong;


    public GiaoVien(String ma , String name , String ns , String dc , String khoa , String luong){
        super(ma , name , ns , dc);
        this.khoa = khoa;
        this.luong = luong;
    }

    @Override
    public String toString(){
        return super.toString() + " " + khoa + " " + luong;
    }
}
