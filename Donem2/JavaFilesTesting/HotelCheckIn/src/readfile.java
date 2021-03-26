import java.io.File;
import java.util.Scanner;

public class readfile {
    private Scanner x;

    /**
     * OpenFile metodu istenilen dosyayi acar
     * 
     * @param fileName acilacak dosyanin adı
     */
    public void OpenFile(String fileName) {
        try {
            x = new Scanner(new File(fileName));
        } catch (Exception e) {
            System.out.println("Could not found file");
        }
    }

    // reading the file and transferring the data to -> exFileArray
    /**
     * AcilanDosyayi char dizisine dönüştürür
     * 
     * @return exfileArray acilan dosyanin char dizisine donusturlmusu
     */
    public char[] ReadFile() {
        String exFile = "";
        while (x.hasNext()) {
            String sentence = x.next();
            exFile += sentence + "\n";
        }
        char[] exFileArray = FileToArray(exFile);
        return exFileArray;
    }

    // after reading closing the file for further operations
    /**
     * Acilan Dosya sonraki islemler icin kapatilir.
     */
    public void CloseFile() {
        x.close();
    }

    // getting the string to char array for easier processing
    /**
     * FileToArray String girdiyi char dizisine donusturur.
     * 
     * @param exFile char dizisine donusturulecek string ifade
     */
    private char[] FileToArray(String exFile) {
        char[] exFileArray = new char[exFile.length()];
        for (int i = 0; i < exFile.length(); i++) {
            exFileArray[i] = exFile.charAt(i);
        }

        // this for loop prints the whole first file
        for (char c : exFileArray) {
            System.out.print(c);
        }

        return exFileArray;
    }
}
