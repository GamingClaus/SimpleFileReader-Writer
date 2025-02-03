import java.util.InputMismatchException;
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
            System.out.println("4. List Files.");
            System.out.println("5. Exit.");

            System.out.print("Enter what you want to do:");

            try{
                int userChoice = scanner.nextInt();
                scanner.nextLine(); //consume the created next line.

                switch(userChoice){
                    case 1:
                        writer.writeFile();
                        break;
                    case 2:
                        reader.readFile();
                        break;
                    case 3:
                        writer.deleteFile();
                        break;
                    case 4:
                        reader.getFileList();
                        break;
                    case 5:
                        System.out.println("Exiting the Program.");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Put a proper number in.");
                        break;
                }
            }
            catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number between 1 and 5.");
                scanner.nextLine(); // Clear the invalid input
            }
            catch (Exception e) {
                throw new RuntimeException(e);
            }


        }


    }








}