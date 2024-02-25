package inputFile;
import java.io.*;
import java.util.Scanner;

public class FileInput{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter file path");
        String filePath = scanner.nextLine();

        File inFile = new File(filePath);

        if(!inFile.exists()|| inFile.isDirectory()){
            System.out.println("Provided path is not a valid file");
            scanner.close();
            return;
        }

        System.out.println("You entered the following file: "+inFile.getAbsolutePath());

        scanner.close();
    }
}