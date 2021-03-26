/**
 * @author Denizhan Toprak
 * @version 1.0.0
 */

public class App {
    public static void main(String[] args) throws Exception {
        readfile r = new readfile();
        String fileName = "otelKayit.txt";
        char[] exFileArray;
        int processType;
        int roomNumber;

        // open existing file
        r.OpenFile(fileName);
        exFileArray = r.ReadFile();
        r.CloseFile();

        // check for input
        Input input = new Input();
        roomNumber = input.InputRoomNumber();
        processType = input.UserProcessType();

        // change the file
        writeFile wf = new writeFile();
        wf.ManipulateArray(exFileArray, roomNumber, processType);

        // export the changed file
        wf.DeleteFile(fileName);
        wf.WriteNewFile(fileName, exFileArray);
    }
}
