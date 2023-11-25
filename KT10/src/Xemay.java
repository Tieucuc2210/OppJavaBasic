public class Xemay extends Chung{
    public int tocdo ,gb2;


    public Xemay(String ma , String name , String hang , String mausac , int tocdo , int gb2){
        super(ma , name , hang , mausac);
        this.tocdo = tocdo;
        this.gb2 = gb2;
    }


    @Override
    public String toString(){
        return super.toString() + " " + tocdo + " " + gb2;
    }
}
