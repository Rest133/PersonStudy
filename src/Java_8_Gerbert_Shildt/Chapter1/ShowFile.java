package Java_8_Gerbert_Shildt.Chapter1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin;

        try {
            fin = new FileInputStream(new File("src/Java_8_Gerbert_Shildt/Chapter1/File.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("Невозможно открыть файл");
            return;
        }
        try {
            do {
                i = fin.read();
                if (i != -1) System.out.print((char) i);
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("Ошибка в файле");
        }
        //Можно код ниже запихнуть в оператор finally
        try {
            fin.close();
        } catch (IOException e) {
            System.out.println("Ошибка при закрытии файла");
        }
    }
}
