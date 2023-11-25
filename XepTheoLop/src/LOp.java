public class LOp {
    public String ma , name , lop , email;

    public String getMa() {
        return ma;
    }

    public int getLop() {
        return Integer.parseInt(String.valueOf(this.lop.substring(4)));
    }

    public  LOp(String ma , String name , String lop , String email){
        this.ma = ma;
        this.name = name;
        this.lop = lop;
        this.email = email;
    }

    @Override
    public String toString(){
        return  ma + " " + name + " " + lop + " " + email;
    }
}
