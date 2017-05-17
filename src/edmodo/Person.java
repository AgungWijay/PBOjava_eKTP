/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edmodo;
import java.util.Collections;
/**
 *
 * @author Asus
 */
public class Person implements Comparable<Person>  {
    private String NIK;
     private String Nama;
     private String TTL;
      private String JenisKelamin;
      private String Alamat;
      private String StatusKawin;
      private String Kewarganegaraan;
      private String Agama;
      private String MasaBerlaku;
      
     private int Age;

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }
	
       
	public Person(String NIK ,String nama,String TTL, int Aage, String JK,String Alamat, String StatusKawin,String Kewarganegaraan, String Agama){
            setNIK(NIK);
            setNama(nama);
                setTTL(TTL);
		setAge(Aage);
                setJenisKelamin(JK);
                setAlamat(Alamat);
                setStatusKawin(StatusKawin);
                setKewarganegaraan(Kewarganegaraan);
                setAgama(Agama);

	
	}

        public String getNIK() {
        return NIK;
    }

    public void setNIK(String NIK) {
        this.NIK = NIK;
    }
   

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }
        public String getTTL() {
        return Nama;
    }

    public void setTTL(String TTL) {
        this.TTL = TTL;
    }
      public String getStatusKawin() {
        return StatusKawin;
    }
       public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }

    public void setStatusKawin(String StatusKawin) {
        this.StatusKawin = StatusKawin;
    }

    public String getJenisKelamin() {
        return JenisKelamin;
    }

    public void setJenisKelamin(String JenisKelamin) {
        this.JenisKelamin = JenisKelamin;
    }
     public String getKewarganegaraan() {
        return Kewarganegaraan;
    }

    public void setKewarganegaraan(String Kewarganegaraan) {
        this.Kewarganegaraan = Kewarganegaraan;
    }
    public String getAgama() {
        return Agama;
    }

    public void setAgama(String Agama) {
        this.Agama = Agama;
    }
    public String getMasaBerlaku(String MasaBerlaku) {
        return MasaBerlaku;
    }
    public void setMasaBerlaku(String MasaBerlaku) {
        this.MasaBerlaku = MasaBerlaku;
    }
    
    @Override
    public int compareTo(Person b) {
		if(Nama.compareTo(b.getNama()) < 0 ) return -1; 
	      if (NIK.compareTo(b.getNIK()) == 0) return 0;      
	    return 1; }

}
