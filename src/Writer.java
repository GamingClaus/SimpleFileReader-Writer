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
        System.out.print("Enter the file which you want to write on:");
        String filename = scanner.nextLine().trim();
        File file = new File("E:\\Java Developement\\FileReaderAndWriter\\txtFiles\\"+ filename + ".txt");

        if(!file.exists()){
            System.out.println("Creating a new File named " + filename+".txt");
        }
        else{
            System.out.println("Appending to an existing File " + filename+".txt");
        }

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file,true));
            System.out.print("Enter the Contents you want to write (Type 'exit' to finish):");
            while(true){
                String user_input = scanner.nextLine();
                if(user_input.equalsIgnoreCase("exit")){
                    break;
                }
                writer.write(user_input);
                writer.newLine();
            }

            System.out.println("Contents Written to " + filename+".txt");
            writer.close();

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }


    public void deleteFile() {
        Reader reader = new Reader();
        reader.getFileList();
        System.out.print("Enter the filename which you want to delete:");
        String filename = scanner.nextLine().trim();
        File file = new File("E:\\Java Developement\\FileReaderAndWriter\\txtFiles\\"+ filename + ".txt");
        if(!file.exists()){
            System.out.println("There is no file named " + filename+".txt");
        }
        else{
            String choice = "";
            System.out.println("Are you sure you want to delete it? Type('Yes' or 'Y') to confirm:");
            choice = scanner.nextLine();
            if(choice.equalsIgnoreCase("Yes") || choice.equalsIgnoreCase("Y")){
                file.delete();
                System.out.println("You successfully deleted " + filename+".txt");
            }
            else{
                System.out.println("You didn't delete the file named " + filename+".txt");
            }

        }

    }
}
