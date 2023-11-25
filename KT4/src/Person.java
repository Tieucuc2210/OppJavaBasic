public class Person {
    public String ma , name , ns , dc;

    public Person(String ma , String name , String ns , String dc){
        this.ma = ma;
        this.name = name;
        this.ns = ns;
        this.dc = dc;
    }

    public String getDc() {
        return dc;
    }

    public void ChuanHoa(){
        String[] arr = this.name.split("\\s+");
        for (int i =0 ;i < arr.length; i++){
            String tmp = arr[i];
            String dau = tmp.substring(0 , 1);
            String cuoi = tmp.substring(1);
            arr[i] = dau.toUpperCase() + cuoi.toLowerCase();
        }

        this.name = String.join(" " , arr);

        if (this.ns.charAt(1) == '/'){
            this.ns = "0" + this.ns;
        }
        if (this.ns.charAt(4) == '/'){
            this.ns = this.ns.substring(0 ,3) + "0" + this.ns.substring(3);
        }
    }

    @Override
    public String toString(){
        return ma + " " + name + " " + ns + " " + dc;
    }
}
