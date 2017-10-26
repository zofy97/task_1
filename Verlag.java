/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aufgabe_1;

/**
 *
 * @author FIni
 */
public enum Verlag {
    VERLAG_1("Cornelsen"),
    VERLAG_2("Carlsen"),
    VERLAG_3("Springer"),
    VERLAG_4("Langenscheidt"),
    VERLAG_5("Fischer");
    private final String name;

    Verlag(String verlagName) {
        name = verlagName;
    }

    public String getVerlagName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
