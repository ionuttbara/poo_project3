
public class Produs implements IQuantity {
    private String Nume;
    private int Pret;
    private int Cantitate;

    //getter/setter
    public String getNume(){
        return this.Nume;
    }
    public int getPret(){
        return this.Pret;
    }
    public int getCantitate(){
        return this.Cantitate;
    }

    public void setNume(String nume){
        this.Nume=nume;
    }
    public void setPret(int pret){
        this.Pret=pret;
    }
    public void setCantitate(int cant){
        this.Cantitate=cant;
    }

    //default Constructor
    public Produs(){
        this.Nume="Empty";
        this.Pret=-1;
        this.Cantitate=-1;
    }
    public Produs(String nume,int pret,int cantitate){
        this.Nume=nume;
        this.Pret=pret;
        this.Cantitate=cantitate;

    }

    //toString Modifiable
    public String toString(){
        StringBuffer s = new StringBuffer();
        s.append(Nume+" ");
        s.append(Pret+" lei ");
        s.append(Cantitate+" de bucati");
        return s.toString();
    }
}
