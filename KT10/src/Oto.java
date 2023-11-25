public class Oto extends Chung{
    public int ml , gb1;
    public Oto(String ma , String name , String hang , String mausac , int ml , int gb1){
        super(ma , name , hang , mausac);
        this.ml = ml;
        this.gb1 = gb1;
    }
    @Override
    public String toString(){
        return super.toString() + " " + ml + " " + gb1;
    }
}
