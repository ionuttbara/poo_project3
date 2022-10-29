public class Admin {
    private static Admin instance;

    private String nume;

    private Admin(){
        this.nume="";
    }
    private Admin(String nume){
        this.nume=nume;
    }

    public static Admin getInstance(){
        if(instance==null){
            instance=new Admin();
        }
        return instance;
    }


}
