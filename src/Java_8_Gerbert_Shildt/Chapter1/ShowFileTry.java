package Java_8_Gerbert_Shildt.Chapter1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ShowFileTry {
    public static void main(String[] args) {
        int i;

        try (FileInputStream fin = new FileInputStream(new File("src/Java_8_Gerbert_Shildt/Chapter1/File.txt"))) { // можно указать несколько через ";"
            do {
                i = fin.read();
                if (i != -1) System.out.print((char) i);
            } while (i != -1);
        }catch (IOException e){
            System.out.println("Кукусики! Ошибка :D");
        }//происходит закрытие файла из переменной fin
    }
}
