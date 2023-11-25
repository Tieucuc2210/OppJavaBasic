public class NhanVien {

    public String ma , chucvu , name;
    public int luong , ngay;

    public NhanVien(String ma ,String name, int luong , int ngay , String chucvu){
        this.ma = ma;
        this.name = name;
        this.luong = luong;
        this.ngay = ngay;
        this.chucvu = chucvu;
    }

    public int Salary(){
        return this.luong * this.ngay;
    }
    public  int tinhThuong(){
        int res = Salary();
        if (this.ngay >= 25){
            return (int) (0.2 * res);
        } else if (this.ngay >= 22){
            return (int) (0.1 * res);
        } else return 0;
    }

    public int  phucap(){
        if (this.chucvu.startsWith("GD")){
            return 250000;
        } else if(this.chucvu.startsWith("PGD")){
            return 200000;
        } else if (this.chucvu.startsWith("TP")){
            return  180000;
        } else {
            return 150000;
        }
    }

    @Override
    public String toString(){
        int cuoi = Salary() + tinhThuong() + phucap();
        return ma + " " + name + " " + Salary() + " " + tinhThuong() + " " + phucap() + " " + cuoi;
    }
}
