public class App {
    public static void main(String[] args) throws Exception {
        readfile r = new readfile();
        String exFile;

        // open existing file

        r.OpenFile();
        exFile = r.ReadFile();
        r.CloseFile();

        // check for input
        Input input = new Input();
        input.InputEmployee();
        // change the file

        // export the changed file

    }
}
