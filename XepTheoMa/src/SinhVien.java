public class SinhVien {
    public  String ma , name , lop , email;

    public SinhVien(String ma , String name , String lop , String email){
        this.ma = ma;
        this.name  = name;
        this.lop = lop;
        this.email = email;
    }


    public int getMMa(){
        return Integer.parseInt(String.valueOf(this.ma.substring(4)));
    }

    @Override
    public String toString(){
        return ma + " " + name + " " + lop + " " + email;
    }

}
