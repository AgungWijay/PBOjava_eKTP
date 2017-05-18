package edmodo;

import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
        import java.util.Scanner;

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

        	//nambah orang
        	//int NIK ,nama,TTL,Age,JK,Alamat,StatusKawin,Kewarganegaraan,Agama,MasaBerlaku    
            Person jim = new Person(1,"Jim","Balikpapan-8-Maret-1996",19,"L","Balikpapan","BK","WNI","8-Maret-2018","Islam");
            Person scott = new Person(2,"Scott","Samarinda-3-Agustus-1995",21,"L","Balikpapan","K","WNI","3-Agustus-2018","Islam");
            Person anna = new Person(3,"Anna","Samarinda-12-Agustus-1993",23,"P","Balikpapan","K","WNI","12-Agustus-2018","Islam");
            Person aanna = new Person(4,"Aanna","Surabaya-30-Maret-1995",21,"P","Balikpapan","BK","WNI","30-Maret-2018","Islam");
            Person ajim = new Person(5,"Ajim","Surabaya-23-Maret-1995",21,"L","Balikpapan","K","WNI","23-Maret-2018","Islam");
            Person dedi = new Person(6,"Dedi","Trenggalek-6-Januari-1995",21,"L","Balikpapan","K","WNI","6-Januari-2018","Islam");
            Person anggie = new Person(7,"Anggie","Rejang Lebong-24-September-1995",21,"L","Balikpapan", "BK","WNI","24-September-2018","Islam");
            Person hussin = new Person(8,"Hussin","Tulungagung-17-Januari-1995",21,"L","Balikpapan","BK","WNI","17-Januari-2018","Islam");
            Person dani = new Person(9,"Dani","Balikpapan-28-Januari-1992",24,"L","Balikpapan","BK","WNI","28-Januari-2018","Islam");
            Person raden = new Person(10,"Raden","Curup-25-Januari-1995",21,"L","Balikpapan","K","WNI","25-Januari-2018","Islam");
            Person purniawan = new Person(11,"Purniawan","Trenggalek-28-Januari-1995",21,"L","Balikpapan","BK","WNI","28-Januari-2018","Islam");
            Person ayu = new Person(12,"Ayu","Jakarta-22-Juli-1998",18,"L","Balikpapan","BK","WNI","22-Juli-2018","Islam");
            Person gista = new Person(13,"Gista","Tanggerang-10-Maret-1999",17,"P","Balikpapan","BK","WNI","10-Maret-2018","Islam");
            Person putri = new Person(14,"Putri","Sidoarjo-4-April-1990",27,"P","Balikpapan","K","WNI","4-April-2018","Islam");
            Person sugeng = new Person(15,"Sugeng","Malang-20-Oktober-1995",21,"L","Balikpapan","K","WNI","20-Oktober-2018","Islam");
            Person parjo = new Person(16,"Parjo","Sukabumi-19-November-1994",23,"L","Balikpapan","BK","WNI","19-November-2018","Islam");
            Person sumiati = new Person(17,"Sumiati","Surabaya-25-Agustus-1992",24,"P","Balikpapan","K","WNI","25-Agustus-2018","Islam");
            Person ucol = new Person(18,"Ucol","Madiun-29-Mei-1990",27,"L","Balikpapan","BK","WNI","29-Mei-2018","Islam");
            Person sulis = new Person(19,"Sulis","Makassar-10-Maret-1991",26,"P","Balikpapan","K","WNI","0-Maret-2018","Islam");
            Person ninda = new Person(20,"Ninda","Trenggalek-12-Januari-1995",21,"P","Balikpapan","BK","WNI","12-Januari-2018","Islam");
          

            //masukkan orang ke RT tertentu
            RT1p.put(jim.getNama(), jim);
            RT1p.put(scott.getNama(), scott);
            RT2p.put(anna.getNama(), anna);
            RT2p.put(aanna.getNama(), aanna);
            RT3p.put(ajim.getNama(), ajim);
            RT3p.put(dedi.getNama(), dedi);
            RT3p.put(anggie.getNama(), anggie);
            RT4p.put(hussin.getNama(), hussin);
            RT4p.put(dani.getNama(), dani);
            RT4p.put(raden.getNama(), raden);
            RT5p.put(purniawan.getNama(), purniawan);
            RT5p.put(ayu.getNama(), ayu);
            RT6p.put(gista.getNama(), gista);
            RT6p.put(putri.getNama(), putri);
            RT6p.put(sugeng.getNama(), sugeng);
            RT7p.put(parjo.getNama(), parjo);
            RT7p.put(sumiati.getNama(), sumiati);
            RT8p.put(ucol.getNama(), ucol);
            RT8p.put(sulis.getNama(), sulis);
            RT8p.put(ninda.getNama(), ninda);
            
            
            //Masukkin er Arraylist untuk sorting
            List<Person> RT1 = new ArrayList<>(RT1p.values());
            List<Person> RT2 = new ArrayList<>(RT2p.values());
            List<Person> RT3 = new ArrayList<>(RT3p.values());
            List<Person> RT4 = new ArrayList<>(RT4p.values());
            List<Person> RT5 = new ArrayList<>(RT5p.values());
            List<Person> RT6 = new ArrayList<>(RT6p.values());
            List<Person> RT7 = new ArrayList<>(RT7p.values());
            List<Person> RT8 = new ArrayList<>(RT8p.values());
            
             
            //sorting
            Collections.sort(RT1, (Person o1, Person o2) -> o1.getAge() - o2.getAge());    
		    Collections.sort(RT2, (Person o1, Person o2) -> o1.getAge() - o2.getAge());
		    Collections.sort(RT3, (Person o1, Person o2) -> o1.getAge() - o2.getAge());
		    Collections.sort(RT4, (Person o1, Person o2) -> o1.getAge() - o2.getAge());
		    Collections.sort(RT5, (Person o1, Person o2) -> o1.getAge() - o2.getAge());
		    Collections.sort(RT6, (Person o1, Person o2) -> o1.getAge() - o2.getAge());
		    Collections.sort(RT7, (Person o1, Person o2) -> o1.getAge() - o2.getAge());
		    Collections.sort(RT8, (Person o1, Person o2) -> o1.getAge() - o2.getAge());
            
		    
		    //menampilkan
            int i;
            System.out.println("DATA PENDUDUK KECAMATAN BALIKPAPAN BARAT");
            System.out.println("Daftar Kelurahan    :");
            System.out.println("1.Kelurahan Margo Mulyo\n2.Kelurahan Kampung Baru Ulu");
            System.out.println("\nMasukkan Pilihan : ");
            i = input.nextInt();
            
            //kelurahan Margo Mulyo
            	if(i==1) {
                System.out.println("Daftar RT di Kelurahan Margo Mulyo:");
                System.out.println("1.RT 1\n2.RT 2\n3.RT 3\n4.RT 4");
                System.out.println("\nMasukkan Pilihan : ");
                int rta = input.nextInt();
                if(rta==1) {
                	System.out.println("Daftar Penduduk : ");
                    RT1.forEach((p) -> {
                    System.out.println(p.getNIK()+"\t"+p.getNama()+"\t"+p.getTTL()+"\t"+p.getAge()+"\t"+p.getJenisKelamin()+"\t"+p.getAlamat()+"\t"+p.getStatusKawin()+"\t"+p.getKewarganegaraan()+"\t"+p.getMasaBerlaku()+"\t"+p.getAgama());
                });              
                }
                else if(rta==2) {
                    RT2.forEach((p) -> {
                    System.out.println(p.getNIK()+"\t"+p.getNama()+"\t"+p.getTTL()+"\t"+p.getAge()+"\t"+p.getJenisKelamin()+"\t"+p.getAlamat()+"\t"+p.getStatusKawin()+"\t"+p.getKewarganegaraan()+"\t"+p.getMasaBerlaku()+"\t"+p.getAgama());
                });
                }
                else if (rta==3) {
                    RT3.forEach((p) -> {
                    System.out.println(p.getNIK()+"\t"+p.getNama()+"\t"+p.getTTL()+"\t"+p.getAge()+"\t"+p.getJenisKelamin()+"\t"+p.getAlamat()+"\t"+p.getStatusKawin()+"\t"+p.getKewarganegaraan()+"\t"+p.getMasaBerlaku()+"\t"+p.getAgama());  
                    });
                }
                else if(rta==4) {
                    RT4.forEach((p) -> {
                    System.out.println(p.getNIK()+"\t"+p.getNama()+"\t"+p.getTTL()+"\t"+p.getAge()+"\t"+p.getJenisKelamin()+"\t"+p.getAlamat()+"\t"+p.getStatusKawin()+"\t"+p.getKewarganegaraan()+"\t"+p.getMasaBerlaku()+"\t"+p.getAgama());  
                    });
                }   
            }
            	
            	
            //kelurahan Kampung Baru Ulu
                else if (i==2) { 
                	System.out.println("Daftar RT di Kelurahan Kampung Baru Ulu");
                    System.out.println("1.RT 5\n2.RT 6\n3.RT 7\n4.RT 8");
                    System.out.println("\nMasukkan Pilihan : ");
                    int rta = input.nextInt();
                if(rta==1) { 
                    System.out.println("Daftar Penduduk : ");
                    RT5.forEach((p) -> {
                    System.out.println(p.getNIK()+"\t"+p.getNama()+"\t"+p.getTTL()+"\t"+p.getAge()+"\t"+p.getJenisKelamin()+"\t"+p.getAlamat()+"\t"+p.getStatusKawin()+"\t"+p.getKewarganegaraan()+"\t"+p.getMasaBerlaku()+"\t"+p.getAgama());    
                    });              
                }
                else if(rta==2) {
                	RT6.forEach((p) -> {
                	System.out.println(p.getNIK()+"\t"+p.getNama()+"\t"+p.getTTL()+"\t"+p.getAge()+"\t"+p.getJenisKelamin()+"\t"+p.getAlamat()+"\t"+p.getStatusKawin()+"\t"+p.getKewarganegaraan()+"\t"+p.getMasaBerlaku()+"\t"+p.getAgama());    
                	});
                }
                else if (rta==3){
                    RT7.forEach((p) -> {
                    System.out.println(p.getNIK()+"\t"+p.getNama()+"\t"+p.getTTL()+"\t"+p.getAge()+"\t"+p.getJenisKelamin()+"\t"+p.getAlamat()+"\t"+p.getStatusKawin()+"\t"+p.getKewarganegaraan()+"\t"+p.getMasaBerlaku()+"\t"+p.getAgama());   
                    });
                }
                else if(rta==4){
                    RT8.forEach((p) -> {
                    System.out.println(p.getNIK()+"\t"+p.getNama()+"\t"+p.getTTL()+"\t"+p.getAge()+"\t"+p.getJenisKelamin()+"\t"+p.getAlamat()+"\t"+p.getStatusKawin()+"\t"+p.getKewarganegaraan()+"\t"+p.getMasaBerlaku()+"\t"+p.getAgama());              
                    });
                }   
          }
     }       
}
        