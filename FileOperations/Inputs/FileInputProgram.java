package FileOperations.Inputs;
import java.io.*;
import java.util.Scanner;

public class FileInputProgram{
    public static void main(String[] args){
        FileInputProgram f = new FileInputProgram();
        String y = f.enterPath();

        System.out.println("returned value is " + y);
    }


    public String enterPath(){
        String fileAbsolutePath;
        Scanner scanner = new Scanner(System.in);
        System.out.print("path");
        String filePath = scanner.nextLine();
        
        File inFile = new File(filePath);
        
        if(!inFile.exists()|| inFile.isDirectory()){
            System.out.println("Provided path is not a valid file");
            scanner.close();
            return "File does not exist";
        }
        
        
        fileAbsolutePath = inFile.getAbsolutePath();        
        System.out.println("You entered the following file: "+ fileAbsolutePath);
        
        scanner.close();
        return fileAbsolutePath;
        
    }
}


