import java.io.*;
import java.util.Scanner;

public class Reader {
    Scanner scanner = new Scanner(System.in);

    Reader(){


    }

    public void readFile(){
        System.out.print("Enter the filename which you read:");
        File filename = new File(scanner.nextLine() + ".txt");
        String line;
        try {

            BufferedReader reader = new BufferedReader(new FileReader(filename));
            if(filename.exists()){
                System.out.println("Reading to  File " + filename.getName() +" Contents.");
            }
            else{
                System.out.println("There is no file named " + filename.getName());
            }
            while((line=reader.readLine())!= null){
                System.out.println(line);
            }
            reader.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
