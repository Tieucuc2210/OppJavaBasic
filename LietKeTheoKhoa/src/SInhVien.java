public class SInhVien {
    public String ma , name , lop , email;

    public SInhVien(String ma , String name , String lop , String email){
        this.ma = ma;
        this.name = name;
        this.lop = lop;
        this.email = email;
    }

    public int getlop(){
        return Integer.parseInt(String.valueOf(this.ma.substring(0 , 4)));
    }

    public void ChuanHoa(){
        String[] arr = this.name.split("\\s++");
        for (int i =0 ;i < arr.length ;i++){
            String wok = arr[i];
            String dau = wok.substring(0 , 1);
            String cuoi = wok.substring(1);
            arr[i] = dau.toUpperCase() + cuoi.toLowerCase();
        }
        this.name = String.join(" ", arr);
    }
    @Override
    public String toString(){
        return ma + " " + name + " " + lop + " " + email;
    }
}
