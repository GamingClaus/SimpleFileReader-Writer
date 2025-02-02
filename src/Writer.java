import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Writer {
    Scanner scanner = new Scanner(System.in);

    Writer(){



    }

    public void writeFile(){
        System.out.print("Enter the filename which you want to write on:");
        File filename = new File(scanner.nextLine() + ".txt");
        try {

            BufferedWriter writer = new BufferedWriter(new FileWriter(filename,true));
            if(filename.exists()){
                System.out.println("Appending to an existing File " + filename.getName());
            }
            else{
                System.out.println("Creating a new File named " + filename.getName());
            }
            System.out.print("Enter the Contents you want to write (Type 'exit' to finish):");
            while(true){
                String user_input = scanner.nextLine();
                if(user_input.equalsIgnoreCase("exit")){
                    break;
                }
                writer.write(user_input);
                writer.newLine();
            }

            System.out.println("Contents Written to " + filename);
            writer.close();

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }


    public void deleteFile() {

    }
}
