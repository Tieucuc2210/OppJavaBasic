public class GiaoVien {

    public String ma , name;
    public  int luong;


    public GiaoVien(String ma , String name , int luong){
        this.ma = ma;
        this.name = name;
        this.luong = luong;
    }

    public int getLuong(){
        return Integer.parseInt(ma.substring(2));
    }

    public int Income(){
        int check = getLuong() * this.luong;
        if (this.ma.startsWith("HT")){
            return check + 2000000;
        } else if (this.ma.startsWith("HP")){
            return  check + 900000;
        } else {
            return  check + 500000;
        }

    }
    @Override
    public String toString(){
        int p = Income();
        return ma + " " + name + " " + getLuong() + " " + p;
    }


}
