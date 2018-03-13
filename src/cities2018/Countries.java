/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cities2018;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author Student
 */
public class Countries {
    private Map<String,String> countries = new HashMap();
    
    public Countries() {
        countries.put("Poland", "Warsaw");
        countries.put("England", "London");
        countries.put("Germany", "Berlin");
        countries.put("France", "Paris");
        countries.put("Spain", "Madryt");
        
        
    }
    
    public Collection<String> capitals()
    {
        return countries.values();
    }
    
    public Collection<String> sortedcapitals()
    {
        TreeSet set = new TreeSet();
        set.addAll(capitals());
        return set;
    }
        
    public Collection<String> countries()
    {
    
    return countries.keySet();
    }

    public Collection<String> sortedcountries()
    {
        TreeSet set = new TreeSet();
        set.addAll(countries());
        return set;
    }
    
    public Map<String,String> sortedByCountries()
    {
        TreeMap map = new TreeMap(countries);
        return map;
    }
       
    public Map<String,String> sortedByCapitals()
    {
        Map<String,String> map= new TreeMap();
        for(String key: countries.keySet()){
            String value = countries.get(key);
            map.put(value,key);
        }
        return map;
        
    }
    @Override
    public String toString() {
        return countries.toString();
    }    
    
    public static void main(String[] args) {
        Countries c = new Countries();
        System.out.println(c);
        System.out.println(c.capitals());
        System.out.println(c.countries());
        System.out.println(c.sortedcapitals());
        System.out.println(c.sortedcountries());
        System.out.println(c.sortedByCapitals());
        System.out.println(c.sortedByCountries());
}
    
}
