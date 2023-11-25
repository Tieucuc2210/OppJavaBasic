import java.util.ArrayList;

public class BangDiem {


    private static int dem =1;
    public String ma, name;
    public ArrayList<Double> v;

    public BangDiem(String name , ArrayList<Double>v ){
        ma = check();
        this.name = name;
        this.v = new ArrayList<>();

    }

    private String check(){
        String t = String.format("%02d" , dem);
        dem++;
        return "SV" + t;
    }
    
    public double TinhDiem(){
        double res = v.stream().mapToDouble(Double::doubleValue).sum()/10;
        return res;
    }

    public String getMa() {
        return ma;
    }

    @Override
    public String toString(){
        StringBuilder ans = new StringBuilder();
        double dtb = v.stream().mapToDouble(Double::doubleValue).sum() /10;

        if (dtb >= 9){
            ans.append("XUAT XAC");
        } else if (dtb >= 8){
            ans.append("GIOI");
        } else if (dtb >= 7){
            ans.append("KHA");
        } else if (dtb >= 5){
            ans.append("TRUNG BINH");

        } else{
            ans.append("YEU");
        }
        return ma + " " + name + " " + String.format("%.1f" , dtb) + " " + ans.toString();
    }
}
