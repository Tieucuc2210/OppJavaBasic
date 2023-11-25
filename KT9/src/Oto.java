public class Oto extends Chung{


    public int maluc , giaban1;

    public int getGiaban1() {
        return giaban1;
    }

    public Oto(String ma , String name , String hang , String mausac , int maluc , int giaban1){
        super(ma , name , hang , mausac);
        this.maluc = maluc;
        this.giaban1 = giaban1;
    }

    @Override
    public String toString(){
        return super.toString() + " " + maluc + " " + giaban1;
    }
}
