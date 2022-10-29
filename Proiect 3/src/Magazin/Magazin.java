package Magazin;
public class Magazin {

    private String Oras;

    private String Strada;

    private int Numar;

    //get/set
    public String getOras(){
        return this.Oras;
    }
    public void setOras(String Oras){
        this.Oras=Oras;
    }

    public String getStrada(){
        return this.Strada;
    }

    public void setStrada(String Strada){
        this.Strada=Strada;
    }

    public int getNumar(){
        return this.Numar;
    }

    public void setNumar(int Numar){
        this.Numar=Numar;
    }


    //default constructor
    public Magazin(){
        this.Oras="Ohio-";
        this.Strada="Ohio-";
        this.Numar=-1;
    }
    //param constructor
    public Magazin(String Oras,String Strada,int Numar){
        this.Oras=Oras;
        this.Strada=Strada;
        this.Numar=Numar;
    }


    //toString Modifiable
    public String toString(){
        StringBuffer s = new StringBuffer();
        s.append(this.Oras+" ");
        s.append(this.Strada+" ");
        s.append(this.Numar+" ");
        return s.toString();
    }

}
