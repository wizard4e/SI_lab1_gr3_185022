import java.util.ArrayList;
import java.util.List;

class Receipt {
    private List<Item> artikli = new ArrayList<Item>();

    public Receipt(List<Item> artikli){
        this.artikli=artikli;
    }


    //Dodavanje artikal:
    public void dodadi(Item artikl){
        artikli.add(artikl);
    }

    public void brishi(Item artikl){
        artikli.remove(artikl);
    }

    public double smetka(){
        double smetka = 0;
        for(Item i:this.artikli){
            smetka+=i.price;
        }

        return smetka;
    }

    public double ddv(){
        double ddv=0;
        for(Item i:this.artikli){
            ddv+=i.taxReturn();
        }

        return ddv;
    }

}
