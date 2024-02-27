package binaryOperations;

import java.io.*;


import FileOperations.Inputs.ParentFile;
import FileOperations.Inputs.UserMessage;

public class MainOperation{
    public static void main(String[] args) {

        ParentFile pf = new ParentFile();
        pf.ReadParentFile();


        UserMessage um = new UserMessage();
        um.ReadUserMessage();

        // System.out.println("Parent => "+p+"\n User message => "+u);
    }
}


class Convert{
    public void toBinary(File file){
        try{
            File inputFile = new File("path");
            File outputFile = new File("file.bin");       
            
            //input stream to read bytes from the input file
            FileInputStream inputStream = new FileInputStream(inputFile);
            //output Stream to write data to the output file
            FileOutputStream outputStream = new FileOutputStream(outputFile);
    
            //reading bytes from the input file and writing to the output file
            int bytesRead;
            byte[] buffer = new byte[1024];
            while((bytesRead = inputStream.read(buffer)) != -1){
                outputStream.write(buffer,0,bytesRead);
            }
    
            System.out.println(outputFile);
            inputStream.close();
            outputStream.close();
        }catch(Exception e){
            e.printStackTrace();
        }

    }

    public void fromBinary(File bin_file){
        try{
            File inputFile = new File("binaryOperations/file.bin");
            File outputFile = new File("file.png");       
            
            //input stream to read bytes from the input file
            FileInputStream inputStream = new FileInputStream(inputFile);
            //output Stream to write bytes to the output file
            FileOutputStream outputStream = new FileOutputStream(outputFile);

    
            //reading bytes from the input file and writing to the output file
            int bytesRead;
            byte[] buffer = new byte[1024];
            while((bytesRead = inputStream.read(buffer)) != -1){
                outputStream.write(buffer,0,bytesRead);
            }
    
            System.out.println(outputFile);
            inputStream.close();
            outputStream.close();  
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

