import java.io.File;
import java.io.IOException;
public class FileExample{
    public static void main(String[] args){
        File file=new File("text.txt");

        try{
            if(file.createNewFile()){
                System.out.print("file created");
            }
            else{
                System.out.print("file alredy exist");
            }
        }
        catch (IOException e){
            System.out.print("AN ERRROR OCURED");
        }

    }
}