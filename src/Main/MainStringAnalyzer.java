package Main;

import Methods.StringAnalyzer;

import java.util.Scanner;

public class MainStringAnalyzer {
    public static void main(String[] args) {

        StringAnalyzer stringAnalyzer = new StringAnalyzer();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe uma string: ");
        String input = scanner.nextLine();

        int count = stringAnalyzer.countLetterA(input);
        System.out.println("A letra 'a' aparece " + count + " vezes na string.");
    }
}
