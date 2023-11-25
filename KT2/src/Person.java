public class Person {
    public  String name , ns , dc;


    public Person(){
        name = ns = dc = " ";
    }
    public Person(String name , String ns , String dc){
        this.name = name;
        this.ns = ns;
        this.dc = dc;

    }
    public String getSortName(){
        String[] arr = this.name.split("\\s+");
        StringBuilder res = new StringBuilder(arr[arr.length - 1]);
        for (int i =0 ; i < arr.length -1; i++){
            res.append(arr[i]).append(" ");
        }
        return res.toString();
    }

    public void ChuanHoa(){
        String[] arr = this.name.split("\\s++");
        for (int i =0 ;i < arr.length ; i++){
            String wok = arr[i];
            String dau = wok.substring(0 , 1);
            String cuoi = wok.substring(1);
            arr[i] = dau.toUpperCase() + cuoi.toLowerCase();
        }
        this.name = String.format(" " , arr);
    }

    @Override
    public String toString(){
        return name + " " + ns + " " + dc;
    }
}
