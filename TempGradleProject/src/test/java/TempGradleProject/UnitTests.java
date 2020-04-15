package TempGradleProject;


import static org.junit.Assert.assertEquals;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class UnitTests {
	
	Hesaplayici hesaplayici;
	
	@Before 
    public void init()  {
		System.out.println("@BeforeEach");
		hesaplayici = new Hesaplayici();
    }
	
	@Test
	  public void alanHesapla(){
		System.out.println("alanHesapla");
		double kenar_kare = 2;
		int sonuc_kare = 4;
		
		double res = hesaplayici.kareninAlani(kenar_kare);
//		assertEquals(sonuc_kare, res);
	}
	
	@Test
	  public void topla(){
		System.out.println("topla");
		int sayi1 = -2;
		int sayi2 = 4;
		int sonuc = 2;
		
		int res = hesaplayici.topla(sayi1, sayi2);
		assertEquals(sonuc, res);		
	}
	
	@Test
	  public void cikart(){
		System.out.println("cikart");
		int sayi1 = -2;
		int sayi2 = 4;
		int sonuc = -6;
		
		int res = hesaplayici.cikart(sayi1, sayi2);
		assertEquals(sonuc, res);		
	}
	
	@After
    public void clearObjects() throws Exception {
		System.out.println("@AfterEach");
		hesaplayici = null;
    }
}
