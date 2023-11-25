public class SinhVien {
    public String ma , name;
    public float toan , li , hoa;

    public SinhVien(String ma , String name , float toan , float li , float hoa){
        this.ma = ma;
        this.name = name;
        this.toan = toan;
        this.li = li;
        this.hoa = hoa;

    }


    public int laykv(){
        return  Integer.parseInt(String.valueOf(this.ma.charAt(2)));
    }
    public  void ans(){
        System.out.print(this.ma + " " + this.name + " " + laykv() + " ");
        int p = laykv();
        float diem = this.toan + this.li + this.hoa;
        if (p == 1){
            diem += 0.5;

        } else if(p == 2){
            diem += 1;

        } else diem += 1.5;

        if (diem == (int) diem){
            System.out.print((int) diem + " ");
        } else {
            System.out.print(String.format("%.1f" , diem) + " ");
        }
        if (diem >= 24) System.out.print("TRUNG TUYEN");
        else System.out.println("TRUOT");
    }
}
