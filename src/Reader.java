import java.io.*;
import java.util.Scanner;

public class Reader {
    Scanner scanner = new Scanner(System.in);

    Reader(){


    }

    public void readFile(){
        getFileList();
        System.out.print("Enter the filename which you want to read:");
        String filename = scanner.nextLine().trim();
        File file = new File("E:\\Java Developement\\FileReaderAndWriter\\txtFiles\\"+ filename + ".txt");

        if(!file.exists()){
            System.out.println("There is no file named " + filename+".txt");
            return; //exits the method.
        }
        String line;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            while((line=reader.readLine())!= null){
                System.out.println(line);
            }
            reader.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void getFileList(){
        System.out.println("The List of Files which are available:");
        File file = new File("E:\\Java Developement\\FileReaderAndWriter\\txtFiles\\");
        File[] fileArrayList;
        fileArrayList = file.listFiles();
        if(fileArrayList!= null && fileArrayList.length>0){
            for(File list : fileArrayList){
                System.out.println("- "+list.getName());
            }
        }
        else{
            System.out.println("No files found in this directory.");
        }

    }
}
