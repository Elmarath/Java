import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class writeFile {

    /**
     * ManipulateArray gelen dizinin uygun bolumunu istenilen sekilde manipule eder
     * ve yazdirir.
     * 
     * @param exFileArray manipule edilecek dizi
     * @param roomNumber  islem yapilacak oda
     * @param processType islem turu
     */
    public void ManipulateArray(char[] exFileArray, int roomNumber, int processType) {
        int satir = 0;
        int sutun = 0;
        for (int i = 0; i < exFileArray.length; i++) {
            if (satir == roomNumber && sutun == 5 && processType == 1) {
                exFileArray[i] = 'b'; // bos anlamina gelir
            } else if (satir == roomNumber && sutun == 5 && processType == 2) {
                exFileArray[i] = 'i'; // iptal-kullanilamaz anlamina gelir
            } else if (satir == roomNumber && sutun == 5 && processType == 3) {
                exFileArray[i] = 'r'; // rezerve anlamina gelir
            } else if (satir == roomNumber && sutun == 5 && processType == 4) {
                exFileArray[i] = 'b'; // bos anlamina gelir (oda bosaldi)
            }

            sutun++;
            if (exFileArray[i] == '\n') {
                satir++;
                sutun = 0;
            }
        }

        for (char c : exFileArray) {
            System.out.print(c);
        }

    }

    /**
     * WriteNewFile Dosya isminde yeni bir dosya daha acar ve gelen diziyi bu
     * dosyaya yazdirir
     * 
     * @param fileName     islem yapilacak dosya
     * @param newFileArray manipule edilmis yeni array
     */
    public void WriteNewFile(String fileName, char[] newFileArray) throws IOException {
        // making a new file
        try {
            File myObj = new File(fileName);
            if (myObj.createNewFile()) {
                System.out.println("FileCreated");
            } else {
                System.out.println("File already exists");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        // printing the new values
        BufferedWriter outputWriter = null;
        outputWriter = new BufferedWriter(new FileWriter(fileName));
        for (int i = 0; i < newFileArray.length; i++) {
            outputWriter.write(newFileArray[i]);
        }
        outputWriter.flush();
        outputWriter.close();

    }

    /**
     * DeleteFile ismi verilen dosyayi siler
     * 
     * @param fileName islem yapilacak dosya
     */
    public void DeleteFile(String fileName) {
        File exFile = new File(fileName);
        if (!exFile.delete()) {
            System.out.println("Failed to Delete File. Try again");
        }
    }
}
