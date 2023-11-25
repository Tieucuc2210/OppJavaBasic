public class PhanSo {

    private  int tu;
    private  int mau;


    public int gdc(int a , int b){ // ham tim uoc chung lon nhat cua 2 so
        if (b == 0) return a;
        else return gdc(b , a % b);
    }

    public void rutgon(){ // rut gon phan so
        int uc = gdc(tu , mau);
        tu /= uc;
        mau /= uc;

    }
    public PhanSo(int tu , int mau) {
        this.tu = tu;
        this.mau = mau;
    }


    @Override
    public String toString(){
        return tu + " / " + mau;
    }

}
