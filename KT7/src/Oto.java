public class Oto extends Chung{
    public int maluc , giaban2;

    public Oto(String ma , String name , String hang , String masac , int maluc , int giaban2){
        super(ma , name , hang , masac);
        this.maluc = maluc;
        this.giaban2 = giaban2;
    }
    @Override
    public String toString(){
        return super.toString() + " " + maluc + " " + giaban2;
    }
}
