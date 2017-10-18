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
public class Verlag {
    public enum Verlaege    {
        Cornelsen, Carlsen, Springer, Langenscheidt, Taz;
        private final String name;  
        Verlaege(String verlagName) {
            name = verlagName;
        }
        public String getVerlagName()   {
            return name;
        }
    }
}
