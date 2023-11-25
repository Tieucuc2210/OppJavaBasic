public class XeMay extends Chung{
    public int tocdo , giaban2;

    public int getGiaban2() {
        return giaban2;
    }

    public XeMay(String ma , String name , String hang , String mausac , int tocdo , int giaban2){
        super(ma , name , hang , mausac);
        this.tocdo = tocdo;
        this.giaban2 = giaban2;
    }

    @Override
    public String toString(){
        return super.toString() + " " + tocdo + " " + giaban2;
    }
}
