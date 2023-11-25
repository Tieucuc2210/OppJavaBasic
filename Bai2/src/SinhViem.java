public class SinhViem {

    public String name , ns;
    public  float diem1 , diem2 , diem3;


    public SinhViem(String name , String ns , float diem1 , float diem2 , float diem3){
        this.name = name;
        this.ns = ns;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;

    }


    @Override
    public  String toString(){
        float tong = diem1 + diem2 + diem3;
        return String.format("%s %s %.1f" , name ,ns , tong);

    }
}
