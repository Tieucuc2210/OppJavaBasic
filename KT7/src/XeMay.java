public class XeMay extends Chung{


    public int tocdo , giaban1;

    public XeMay(String ma , String name , String hang , String mausac , int tocdo , int giaban1){
        super(ma , name , hang , mausac);
        this.tocdo = tocdo;
        this.giaban1 = giaban1;
    }

    @Override
    public String toString(){
        return super.toString() + " " + tocdo + " " + giaban1;
    }
}
