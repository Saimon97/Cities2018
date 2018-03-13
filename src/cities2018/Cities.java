/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cities2018;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Student
 */
public class Cities {
    private Map<String,List<String>> provinces= new HashMap();
    private ArrayList<String> lista1 = new ArrayList<String>();
    private ArrayList<String> lista2 = new ArrayList<String>();
    private ArrayList<String> lista3 = new ArrayList<String>();
    public Cities() {
        lista1.add("Elbląg");
        lista1.add("Olsztyn");
        lista1.add("Jegłownik");
                
        lista2.add("Gdańsk");
        lista2.add("Malbork");
        lista2.add("Jastarnia");
        
        lista3.add("Warszawa");
        lista3.add("Radom");
        lista3.add("Płock");
        
        provinces.put("Warmońsko-Mazurskie",lista1);
        provinces.put("Pomorskie",lista2);
        provinces.put("Mazowieckie",lista3);
    }
    public ArrayList<String> province(){
        ArrayList<String> pro= new ArrayList<String>(provinces.keySet());
        return pro;
    
    }
    public List<String> cities(String province)
    {
        return provinces.get(province);
    }
    public static void main(String[] args) {
        Cities c = new Cities();
        System.out.println(c.provinces);
        System.out.println(c.province());
        System.out.println(c.cities("Mazowieckie"));
    }
}
