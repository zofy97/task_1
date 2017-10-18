package aufgabe_1;

import aufgabe_1.Verlag.Verlaege;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author s0559289
 */
public class BuchMain {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Wieviele Buecher wollen sie eingeben? (bis 5)");
        int nr = scan.nextInt();
        int count = 0;

        Buch[] buch = new Buch[nr];

        for (int i = 0; i < buch.length; i++) {
            Buch b = new Buch();
            buch[i] = b;

            System.out.println("Geben Sie die Daten des Buches ein:");
            System.out.println("ID:");
            int id = scan.nextInt();
            buch[i].setId(id);
            System.out.println("Autor:");
            String a = scan.next();
            buch[i].setAutor(a);
            System.out.println("Titel:");
            String t = scan.next();
            buch[i].setTitel(t);
            System.out.println("ISBN:");
            String isbn = scan.next();
            buch[i].setIsbn(isbn);
            System.out.println("Verlag: ");
            for(Verlaege v : Verlaege.values()) {
                System.out.print(count);
                System.out.println(v.getVerlagName());
                count++;
            }
            int ver = scan.nextInt();
            for (int n = 0; n <= ver; n++) {
                Verlaege.values();
            }
            buch[i].setVerlag();
                
            System.out.println("Erscheinungsjahr:");
            int j = scan.nextInt();
            buch[i].setJahr(j);

            System.out.println(buch[i]);
        }
        System.out.println("Ausgabe aller Buecher:");
        for (int i = 0; i < buch.length; i++)   {
            System.out.println(buch[i]);
        }
    }
}
