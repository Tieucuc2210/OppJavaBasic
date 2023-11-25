public class TinhGio {

    public String tk , mk , name , den , di;

    public TinhGio(String tk , String mk , String name , String den , String di){
        this.tk = tk;
        this.mk = mk;
        this.name = name;
        this.den = den;
        this.di = di;
    }

    public int Choi(){
        int h1 = Integer.parseInt(this.den.substring(0 , 2));
        int c1 = Integer.parseInt(this.den.substring(3));
        int h2 = Integer.parseInt(this.di.substring(0 , 2));
        int c2 = Integer.parseInt(this.di.substring(3));
        int time1 = h1 * 60 + c1;
        int time2 = h2*60 + c2;
        return time2 -time1;
    }

    public String getTk() {
        return tk;
    }

    @Override
    public String toString(){
        int ans = Choi();
        int h = ans / 60;
        int zz = ans % 60;
        return tk + " " + mk + " " + name + " " + h + " gio " + " " + zz + "phut";

    }
}
