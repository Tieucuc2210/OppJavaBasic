public class SinhhVien {
    private static  int dem = 1;
    public String ma , name , ns, lop;

    public float gpa;

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNs() {
        return ns;
    }

    public void setNs(String ns) {
        this.ns = ns;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public SinhhVien(){
        ma = check();
        name = "";
        ns = "";
        lop = "";
        gpa = 0;
    }
    public SinhhVien(String name , String ns , String lop , float gpa){
        this.ma = check();
        this.name = name;
        this.ns = ns;
        this.lop = lop;
        this.gpa = gpa;
    }

    private String check(){
        String tmp = String.format("%03d" , dem);
        dem++;
        return "SV" + tmp;
    }


    public  void ChuanHoa2(){
        // chuan hao ten
        String[] arr = this.name.split(" ");
        for (int i =0 ;i < arr.length ;i++){
            String z = arr[i];
            String dau = z.substring(0 , 1);
            String cuoi = z.substring(1);

            arr[i] = dau.toUpperCase() + cuoi.toLowerCase();
        }
        this.name = String.join(" " , arr);

        // chuan hoa ngay sinh

//        if (this.ns.charAt(1) == '/'){
//            this.ns = "0" + this.ns;
//        }
//        if (this.ns.charAt(4) == '/'){
//            this.ns = this.ns.substring(0 , 3) + "0" + this.ns.substring(3);
//        }
    }

    public void NgaySinh(){
        if (this.ns.charAt(1) == '/'){
            this.ns = "0" + this.ns;
        }
        if (this.ns.charAt(4) == '/'){
            this.ns = this.ns.substring(0 , 3) + "0" + this.ns.substring(3);
        }
    }

    @Override
    public String toString(){
        return String.format("%s %s %s %s %.2f", ma,name ,ns , lop , gpa);
    }
}
