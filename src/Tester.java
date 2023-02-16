import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class Tester {
    public static void main(String[] args){

        try{
            File file = new File("src\\file.txt");

            if(file.createNewFile()){
                System.out.println("New file created!");
            } else{
                System.out.println("Overwriting existing file!");
            }
            FileWriter wr = new FileWriter(file);
            wr.write("exact time is: \n");
            wr.write(String.valueOf(LocalDateTime.now()));
            wr.flush();
            wr.close();
        }catch(IOException e){
            e.printStackTrace();
        }
        

    }
}
