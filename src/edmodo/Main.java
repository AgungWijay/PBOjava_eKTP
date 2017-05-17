/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edmodo;

import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
        import java.util.Scanner;

/**
 *
 * @author syahr
 */
public class Main {
    public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
        //buat RT
Map<String, Person> RT1p = new HashMap<>();
Map<String, Person> RT2p = new HashMap<>();
Map<String, Person> RT3p = new HashMap<>();
Map<String, Person> RT4p = new HashMap<>();
Map<String, Person> RT5p = new HashMap<>();
Map<String, Person> RT6p = new HashMap<>();
Map<String, Person> RT7p = new HashMap<>();
Map<String, Person> RT8p = new HashMap<>();

//nambah orang------------------------------------------------------------------------------------------------
    Person jim = new Person("Jim", 25,"L");
    Person scott = new Person("Scott", 28,"L");
    Person anna = new Person("Anna", 23,"P");
    Person aanna = new Person("aAnna", 23,"P");
    Person ajim = new Person("aJim", 25,"L");

    
 //masukkan orang ke RT tertentu------------------------------------------------------------------------------------
    RT1p.put(jim.getNama(), jim);
    RT1p.put(scott.getNama(), scott);
    RT3p.put(aanna.getNama(), aanna);
    RT3p.put(anna.getNama(), anna);
    RT6p.put(jim.getNama(), jim);
    RT5p.put(scott.getNama(), scott);
    RT7p.put(aanna.getNama(), aanna);
    RT8p.put(anna.getNama(), anna);
    
    

//Masukkin er Arraylist untuk sorting-------------------------------------------------------------------------
    List<Person> RT1 = new ArrayList<>(RT1p.values());
    List<Person> RT2 = new ArrayList<>(RT2p.values());
    List<Person> RT3 = new ArrayList<>(RT3p.values());
    List<Person> RT4 = new ArrayList<>(RT4p.values());
    List<Person> RT5 = new ArrayList<>(RT5p.values());
    List<Person> RT6 = new ArrayList<>(RT6p.values());
    List<Person> RT7 = new ArrayList<>(RT7p.values());
    List<Person> RT8 = new ArrayList<>(RT8p.values());
    
     
//sorting---------------------------------------------------------------------------------------------
//Tampilkan ........................................................................................  
        
            
            
        }


		}
    
	
    

