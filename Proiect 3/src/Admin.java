import java.io.FileWriter;
import java.io.IOException;

public class Admin {
    private FileWriter myWriter;
    private static Admin instance;

    private String nume;

    private Admin(){
        this.nume="";
    }
    private Admin(String nume){
        this.nume=nume;
        try {
            FileWriter myWriter = new FileWriter("Log_Admin");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Admin getInstance(){
        if(instance==null){
            instance=new Admin();
        }
        return instance;
    }
    public void WriteToFile(){

        try {

            myWriter.write("Admin instantiat cu succes");
            myWriter.close();

        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }


}
