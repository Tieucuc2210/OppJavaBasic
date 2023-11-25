public class SinhVien {
    public String ma , name , lop , email;

    public SinhVien(String ma , String name , String lop , String email){
        this.ma = ma;
        this.name = name;
        this.lop = lop;
        this.email = email;
    }

    public String getMa() {
        return ma;
    }

    public String getName() {
        return name;
    }

    public String getLop() {
        return lop;
    }

    public String getEmail() {
        return email;
    }

    public void ChuanHoa(){
        String[] arr = this.name.split("\\s++");
        for (int i =0 ;i < arr.length ; i++){
            String tmp = arr[i];
            String dau = tmp.substring(0 , 1);
            String cuoi = tmp.substring(1);
            arr[i] = dau.toUpperCase() + cuoi.toLowerCase();
        }
        this.name = String.join(" " , arr);
    }

    @Override
    public String toString(){
        return ma + " " + name + " " + lop + " " + email;
    }
}
