import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Reader reader = new Reader();
        Writer writer = new Writer();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("1. Write to a File.");
            System.out.println("2. Read a file.");
            System.out.println("3. Delete a file.");
            System.out.println("4. Exit");

            System.out.print("Enter what you want to do:");
            int userChoice = scanner.nextInt();
            scanner.nextLine(); //consume the created next line.

            switch(userChoice){
                case 1:
                    writer.writeFile();
                case 2:
                    reader.readFile();
                case 3:
                    writer.deleteFile();
                case 4:
                    System.out.println("Exiting the Program.");
                    System.exit(0);
            }

        }


    }








}