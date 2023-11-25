public class MatHang {
     private  static int dem = 1;
    public  String ma , name , donvi;
    public int giaban , giamua;

    public int getGiaban() {
        return giaban;
    }

    public void setGiaban(int giaban) {
        this.giaban = giaban;
    }

    public int getGiamua() {
        return giamua;
    }

    public void setGiamua(int giamua) {
        this.giamua = giamua;
    }

    public int cuoicung(){
        return this.giaban - this.giamua;
    }
    public MatHang(String ma , String name , int giaban , int giamua){
        this.ma = check();
        this.name = name;
        this.donvi = donvi;
        this.giaban = giaban;
        this.giamua = giamua;
    }

    private String check(){
        String p = String.format("%04d" , dem);
        dem++;
        return "MH" + p;
    }


    @Override
    public String toString(){
        return  ma + " " + name + " " + donvi + " " + giaban + " " + giamua;
    }
}
