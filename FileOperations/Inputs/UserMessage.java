package FileOperations.Inputs;

public class UserMessage {
    public static void main(String[] args) {
        
    }
    
    public String ReadUserMessage(){
        System.out.print("Enter message ");
        FileInputProgram messageFileInput = new FileInputProgram();
        String msg = messageFileInput.enterPath();
        

        return msg;
    }
}
