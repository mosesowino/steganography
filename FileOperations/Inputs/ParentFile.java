package FileOperations.Inputs;

public class ParentFile {
    public static void main(String[] args) {
    }
    
    public String ReadParentFile(){
        System.out.print("Enter Parent file ");
        FileInputProgram parentFileInput = new FileInputProgram();
        String parentFile = parentFileInput.enterPath();
    
        System.out.println(parentFile);
        return parentFile;
        
    }
}
