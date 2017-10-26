package aufgabe_1;

import aufgabe_1.Verlag;
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
        Scanner scanner = new Scanner(System.in);
        Buch[] buch = new Buch[5];

        int count = 0;
        while (buch.length == 5) {
            System.out.println("Wählen sie aus:");
            System.out.println("1) Buch eingeben");
            System.out.println("2) Buch bearbeiten");
            System.out.println("3) Buch löschen");
            System.out.println("4) Alle Bücher ausgeben");
            System.out.println("\n5) Beenden");

            int auswahl = scanner.nextInt();

            switch (auswahl) {
                case 1:
                    auswahl = 1;
                     {
                        if (count < 5) {
                            Scanner scan = new Scanner(System.in);
                            Buch b = new Buch();
                            System.out.println("Geben Sie die Daten des Buches ein:");

                            System.out.println("ID:");
                            String id = scan.nextLine();
                            b.setId(id);

                            System.out.println("Autor:");
                            String a = scan.nextLine();
                            b.setAutor(a);

                            System.out.println("Titel:");
                            String t = scan.nextLine();
                            b.setTitel(t);

                            System.out.println("ISBN:");
                            String isbn = scan.nextLine();
                            b.setIsbn(isbn);

                            System.out.println("Erscheinungsjahr:");
                            int j = scan.nextInt();
                            if (j > 2017) {
                                System.out.println("Ungültiges Jahr");
                            } else {
                                b.setJahr(j);
                            }
                            
                            System.out.println("Verlag:");
                            System.out.println("1) Cornelsen\n2) Carlsen\n3) Springer\n4) Langenscheidt\n5) Fischer");
                            int ver = scan.nextInt();
                            switch(ver)  {
                                case 1: ver = 1;    {
                                    b.setVerlag(Verlag.VERLAG_1);
                                }
                                case 2: ver = 2;    {
                                    b.setVerlag(Verlag.VERLAG_2);
                                }
                                case 3: ver = 3;    {
                                    b.setVerlag(Verlag.VERLAG_3);
                                }
                                case 4: ver = 4;    {
                                    b.setVerlag(Verlag.VERLAG_4);
                                }
                                case 5: ver = 5;    {
                                    b.setVerlag(Verlag.VERLAG_5);
                                }
                            }
                                    
                            
                            buch[count] = b;

                            count++;
                        } else {
                            System.out.println("Es können keine weiteren Bücher eingetragen werden");
                        }
                        break;
                    }
                case 2:
                    auswahl = 2;
                     {
                        Scanner scan = new Scanner(System.in);
                        System.out.println("Welches Buch möchten sie bearbeiten?");
                        for (int i = 0; i < buch.length; i++) {
                            if (buch[i] != null) {
                                System.out.println(i + ") " + buch[i]);
                            }
                        }
                        int nr = scan.nextInt();
                        scan.reset();

                        System.out.println("Welche Eigenschaft möchten sie bearbeiten?");
                        System.out.println("1) Autor\n2) Titel\n3) ISBN\n4) Erscheinungsjahr\n5) Verlag");

                        int eig = scan.nextInt();
                        scan.reset();
                            
                        Scanner scan2 = new Scanner(System.in);

                        if (eig == 1) {

                            System.out.println("Neuer Autor: ");
                            String aut = scan2.nextLine();
                            buch[nr].setAutor(aut);

                        } else if (eig == 2) {
                            System.out.println("Neuer Titel: ");
                            String ti = scan2.nextLine();
                            buch[nr].setTitel(ti);

                        } else if (eig == 3) {
                            System.out.println("Neue ISBN: ");
                            String is = scan2.nextLine();
                            buch[nr].setIsbn(is);

                        } else if (eig == 4) {
                            System.out.println("Neues Erscheinungsjahr: ");
                            int ja = scan2.nextInt();
                            scan.reset();
                            if (ja > 2017) {
                                System.out.println("Ungültiges Jahr");
                            } else {
                                buch[nr].setJahr(ja);
                            }
                        } else if(eig == 5)  {
                            System.out.println("Verlag:");
                            System.out.println("1) Cornelsen\n2) Carlsen\n3) Springer\n4) Langenscheidt\n5) Fischer");
                            int ver = scan.nextInt();
                            switch(ver)  {
                                case 1: ver = 1;    {
                                    buch[nr].setVerlag(Verlag.VERLAG_1);
                                }
                                case 2: ver = 2;    {
                                    buch[nr].setVerlag(Verlag.VERLAG_2);
                                }
                                case 3: ver = 3;    {
                                    buch[nr].setVerlag(Verlag.VERLAG_3);
                                }
                                case 4: ver = 4;    {
                                    buch[nr].setVerlag(Verlag.VERLAG_4);
                                }
                                case 5: ver = 5;    {
                                    buch[nr].setVerlag(Verlag.VERLAG_5);
                                }
                            }
                        }
                        break;
                    }
                case 3:
                    auswahl = 3;
                     {
                        Scanner scan = new Scanner(System.in); 
                        System.out.println("Welches Buch möchten sie löschen?");
                        for (int i = 0; i < buch.length; i++) {
                            if (buch[i] != null) {
                                System.out.println(i + ") " + buch[i]);
                            }
                        }
                        int nr = scan.nextInt();
                        scan.reset();
                        buch[nr] = null;
                        count--;
                        System.out.println("Buch wurde erfolgreich gelöscht.");
                        break;
                    }
                case 4:
                    auswahl = 4;
                     {
                        Scanner scan = new Scanner(System.in); 
                        for (int i = 0; i < buch.length; i++) {
                            if (buch[i] != null) {
                                System.out.println(buch[i]);
                            } else  {
                                System.out.println(" --- ");
                            }
                        }
                        System.out.println();
                        break;
                    }
                case 5:
                    auswahl = 5;
                     {
                        return;
                    }

            }

            /*System.out.println("Verlag: ");
            for(Verlaege v : Verlaege.values()) {
                System.out.print(count);
                System.out.println(v.getVerlagName());
                count++;
            }
            int ver = scan.nextInt();
            for (int n = 0; n <= ver; n++) {
                Verlaege.values();
            }*/
        }
    }
}
