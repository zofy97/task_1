/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aufgabe_1;

/**
 *
 * @author s0559289
 */
public class Buch implements BuchSchnittstelle  {
    String id;
    String autor;
    String titel;
    String isbn;
    Verlag verlag;
    int jahr;
    
    public Buch()   {
        //Default-Constructor
    }
    
    public Buch(String id, String autor, String titel, String isbn, Verlag verlag , int jahr)   {
        this.id = id;
        this.autor = autor;
        this.titel = titel;
        this.isbn = isbn;
        this.verlag = verlag;
        this.jahr = jahr;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Verlag getVerlag() {
        return verlag;
    }

    public void setVerlag(Verlag verlag) {
        this.verlag = verlag;
    }

    public int getJahr(){
        return jahr;
    }
    
    public void setJahr(int jahr) {
        this.jahr = jahr;
    }

    @Override
    public String toString() {
        return "Buch (" + "Id: " + id + ", Autor: " + autor + ", Titel: " + titel + ", ISBN: " + isbn + ", Verlag: " + verlag + ", Jahr: " + jahr + ')';
    }
}
