package Java_8_Gerbert_Shildt.Chapter1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BRReadLines {
    public static void main(String[] args) throws IOException {
        String string;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите строку текста");
        System.out.println("Если нужно заврешить программу введите слово \"Стоп\" ");
        do {
            string = br.readLine();
            System.out.println(string);
        } while (!string.equals("Стоп"));
    }
}
