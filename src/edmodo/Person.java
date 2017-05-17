/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edmodo;
import java.util.Collections;
/**
 *
 * @author syahr
 */
public class Person implements Comparable<Person>  {
     private String NoKtp;
     private String Nama;
     private String JenisKelamin;
     private int Age;
     private String Agama;
     private String Perkawinan;
     private String Pekerjaan;
     private String Kewarganegaraan;

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }
	
       
	public Person(String nama, int Aage, String JK){
           setNama(nama);
		setAge(Aage);
                setJenisKelamin(JK);

	
	}

    public String getNoKtp() {
        return NoKtp;
    }

    public void setNoKtp(String NoKtp) {
        this.NoKtp = NoKtp;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getJenisKelamin() {
        return JenisKelamin;
    }

    public void setJenisKelamin(String JenisKelamin) {
        this.JenisKelamin = JenisKelamin;
    }
    
    @Override
    public int compareTo(Person b) {
		if(Nama.compareTo(b.getNama()) < 0 ) return -1; 
	      if (NoKtp.compareTo(b.getNoKtp()) == 0) return 0;      
	    return 1; }

}
