package com;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UnitTests {

	@Test
	void test() {
		//fail("Not yet implemented");
	}
	
	@Test
	  public void alanHesapla(){
		System.out.println("Start alanHesapla()... ");
		Hesaplayici hesaplayici = new Hesaplayici();
		
		double kenar_kare = 2;
		int sonuc_kare = 4;
		
		double res = hesaplayici.kareninAlani(kenar_kare);
		assertEquals(sonuc_kare, res);		
	}

}
