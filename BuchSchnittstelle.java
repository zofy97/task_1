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
public interface BuchSchnittstelle {
    public int getId();
    public void setId(int id);
    public String getAutor();
    public void setAutor(String autor);
    public String getTitel();
    public void setTitel(String titel);
    public String getIsbn();
    public void setIsbn(String isbn);
    public Verlag getVerlag();
    public void setVerlag(Verlag verlag);
    public int getJahr();
    public void setJahr(int jahr);
}
