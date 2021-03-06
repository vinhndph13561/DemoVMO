package FileProcessingandExceptionHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedFile {
    public String loader(String FilePath) {
        // initialize the reader with null
        BufferedReader br = null;
        String str = null;
        StringBuilder strb = new StringBuilder();

        try {
            // really initialize it inside the try block
            br = new BufferedReader(new FileReader(FilePath));
            while ((str = br.readLine()) != null) {
                strb.append(str).append("\n");
            }
        } catch (FileNotFoundException f) {
            System.out.println(FilePath + " does not exist");
            return null;
        } catch (IOException e) {
            e.printStackTrace();
        }  finally {
            // this block will be executed in every case, success or caught exception
            if (br != null) {
                // again, a resource is involved, so try-catch another time
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return strb.toString();
    }

    public static void main(String args[]){
        BufferedFile bf = new BufferedFile();
        System.out.println(bf.loader("src/FileProcessingandExceptionHandling/text.txt"));

    }
}
