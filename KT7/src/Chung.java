public class Chung {

    public String ma , name , hang , mausac;

    public String getHang() {
        return hang;
    }

    public Chung(String ma , String name , String hang , String mausac){
        this.ma = ma;
        this.name = name;
        this.hang = hang;
        this.mausac = mausac;
    }

    @Override
    public String toString(){
        return ma + " " + name + " " + hang + " " + mausac;
    }
}
