import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class NumNomeTest {
	
	NumeroExtenso numero;
	
	@Before
	public void criaNumero(){
		this.numero = new NumeroExtenso();
	}

	@Test
	public void test0a10() {
		
		assertEquals("zero", numero.escrever(0));
		assertEquals("um", numero.escrever(1));
		assertEquals("dois", numero.escrever(2));
		assertEquals("tres", numero.escrever(3));
		assertEquals("quatro", numero.escrever(4));
		assertEquals("cinco", numero.escrever(5));
		assertEquals("seis", numero.escrever(6));
		assertEquals("sete", numero.escrever(7));
		assertEquals("oito", numero.escrever(8));
		assertEquals("nove", numero.escrever(9));
		assertEquals("dez", numero.escrever(10));
		
	}
	
	@Test
	public void test11a19() {
		
		assertEquals("onze", numero.escrever(11));
		assertEquals("doze", numero.escrever(12));
		assertEquals("treze", numero.escrever(13));
		assertEquals("quatorze", numero.escrever(14));
		assertEquals("quinze", numero.escrever(15));
		assertEquals("dezesseis", numero.escrever(16));
		assertEquals("dezessete", numero.escrever(17));
		assertEquals("dezoito", numero.escrever(18));
		assertEquals("dezenove", numero.escrever(19));	
		
	}
	
	@Test
	public void testEntradas() {
		
		assertFalse(numero.verificaInteiro(""));
		assertFalse(numero.verificaInteiro("a"));	
		assertFalse(numero.verificaInteiro("4ad"));	
		assertFalse(numero.verificaInteiro(""));	
		assertFalse(numero.verificaInteiro("+/"));
		assertFalse(numero.verificaInteiro("    1"));
		assertFalse(numero.verificaInteiro("1     "));
		assertFalse(numero.verificaInteiro("1    9"));
		
		assertTrue(numero.verificaInteiro("1"));
		assertTrue(numero.verificaInteiro("0"));
		assertTrue(numero.verificaInteiro("1456465"));

	}
	
	@Test
	public void testDezenasFechadas() {
		
		assertEquals("trinta", numero.escrever(30));
		assertEquals("vinte", numero.escrever(20));
		assertEquals("quarenta", numero.escrever(40));
		assertEquals("cinquenta", numero.escrever(50));
		assertEquals("sessenta", numero.escrever(60));
		assertEquals("setenta", numero.escrever(70));
		assertEquals("oitenta", numero.escrever(80));
		assertEquals("noventa", numero.escrever(90));	
		
	}
	
	@Test
	public void testDezenas() {
		
		assertEquals("trinta e um", numero.escrever(31));
		assertEquals("vinte e cinco", numero.escrever(25));
		assertEquals("quarenta e tres", numero.escrever(43));
		assertEquals("cinquenta e quatro", numero.escrever(54));
		assertEquals("sessenta e dois", numero.escrever(62));
		assertEquals("setenta e oito", numero.escrever(78));
		assertEquals("oitenta e seis", numero.escrever(86));
		assertEquals("noventa e nove", numero.escrever(99));	
		
	}
	
	@Test
	public void testCentenasFechadas() {
		
		assertEquals("cem", numero.escrever(100));
		assertEquals("trezentos", numero.escrever(300));
		assertEquals("duzentos", numero.escrever(200));
		assertEquals("quatrocentos", numero.escrever(400));
		assertEquals("quinhentos", numero.escrever(500));
		assertEquals("seicentos", numero.escrever(600));
		assertEquals("setecentos", numero.escrever(700));
		assertEquals("oitocentos", numero.escrever(800));
		assertEquals("novecentos", numero.escrever(900));	
		
	}
	
	@Test
	public void testCentenas() {
		
		assertEquals("cento e um", numero.escrever(101));
		assertEquals("cento e dois", numero.escrever(102));
		assertEquals("trezentos e trinta e um", numero.escrever(331));
		assertEquals("duzentos e vinte e cinco", numero.escrever(225));
		assertEquals("quatrocentos e setenta e oito", numero.escrever(478));
		assertEquals("quinhentos e sessenta e dois", numero.escrever(562));
		assertEquals("seicentos e oitenta e seis", numero.escrever(686));
		assertEquals("setecentos e noventa e nove", numero.escrever(799));
		assertEquals("oitocentos e cinquenta e quatro", numero.escrever(854));
		assertEquals("novecentos e quarenta e tres", numero.escrever(943));	
		
	}
	
	@Test
	public void testMilharFechada() {
		
		assertEquals("mil", numero.escrever(1000));
		assertEquals("dois mil", numero.escrever(2000));
		assertEquals("tres mil", numero.escrever(3000));
		assertEquals("quatro mil", numero.escrever(4000));
		assertEquals("cinco mil", numero.escrever(5000));
		assertEquals("seis mil", numero.escrever(6000));
		assertEquals("sete mil", numero.escrever(7000));
		assertEquals("oito mil", numero.escrever(8000));
		assertEquals("nove mil", numero.escrever(9000));
		
		assertEquals("dez mil", numero.escrever(10000));
		assertEquals("vinte mil", numero.escrever(20000));
		assertEquals("trinta mil", numero.escrever(30000));
		assertEquals("quarenta mil", numero.escrever(40000));
		assertEquals("cinquenta mil", numero.escrever(50000));
		assertEquals("sessenta mil", numero.escrever(60000));
		assertEquals("setenta mil", numero.escrever(70000));
		assertEquals("oitenta mil", numero.escrever(80000));
		assertEquals("noventa mil", numero.escrever(90000));	

		assertEquals("cem mil", numero.escrever(100000));
		assertEquals("duzentos mil", numero.escrever(200000));
		assertEquals("trezentos mil", numero.escrever(300000));
		assertEquals("quatrocentos mil", numero.escrever(400000));
		assertEquals("quinhentos mil", numero.escrever(500000));
		assertEquals("seicentos mil", numero.escrever(600000));
		assertEquals("setecentos mil", numero.escrever(700000));
		assertEquals("oitocentos mil", numero.escrever(800000));
		assertEquals("novecentos mil", numero.escrever(900000));	
	}
	
	@Test
	public void testMilhar() {
		
		assertEquals("mil e cem", numero.escrever(1100));
		assertEquals("dois mil trezentos e trinta", numero.escrever(2330));
		assertEquals("tres mil cento e vinte", numero.escrever(3120));
		assertEquals("quatro mil e um", numero.escrever(4001));
		assertEquals("cinco mil quatrocentos e vinte e dois", numero.escrever(5422));

		
		assertEquals("dez mil e dois", numero.escrever(10002));
		assertEquals("doze mil e quinhentos", numero.escrever(12500));
		assertEquals("trinta e quatro mil e trezentos", numero.escrever(34300));
		assertEquals("quarenta mil e vinte", numero.escrever(40020));
		assertEquals("cinquenta e dois mil duzentos e trinta e um", numero.escrever(52231));


		assertEquals("cem mil e trezentos", numero.escrever(100300));
		assertEquals("cento e dois mil e um", numero.escrever(102001));
		assertEquals("duzentos e vinte e dois mil duzentos e vinte e dois", numero.escrever(222222));
		assertEquals("trezentos e quarenta mil e setenta e um", numero.escrever(340071));
		assertEquals("quatrocentos mil e quatro", numero.escrever(400004));
		assertEquals("quinhentos e dois mil duzentos e trinta", numero.escrever(502230));
		assertEquals("novecentos e noventa e nove mil novecentos e noventa e nove", numero.escrever(999999));
	
	}
	
	@Test
	public void testMilhaoFechado() {
		
		assertEquals("um milhao", numero.escrever(1000000));
		assertEquals("dois milhoes", numero.escrever(2000000));
		assertEquals("tres milhoes", numero.escrever(3000000));
		assertEquals("quatro milhoes", numero.escrever(4000000));
		assertEquals("cinco milhoes", numero.escrever(5000000));
		assertEquals("seis milhoes", numero.escrever(6000000));
		assertEquals("sete milhoes", numero.escrever(7000000));
		assertEquals("oito milhoes", numero.escrever(8000000));
		assertEquals("nove milhoes", numero.escrever(9000000));
		
		assertEquals("dez milhoes", numero.escrever(10000000));
		assertEquals("vinte milhoes", numero.escrever(20000000));
		assertEquals("trinta milhoes", numero.escrever(30000000));
		assertEquals("quarenta milhoes", numero.escrever(40000000));
		assertEquals("cinquenta milhoes", numero.escrever(50000000));
		assertEquals("sessenta milhoes", numero.escrever(60000000));
		assertEquals("setenta milhoes", numero.escrever(70000000));
		assertEquals("oitenta milhoes", numero.escrever(80000000));
		assertEquals("noventa milhoes", numero.escrever(90000000));	

		assertEquals("cem milhoes", numero.escrever(100000000));
		assertEquals("duzentos milhoes", numero.escrever(200000000));
		assertEquals("trezentos milhoes", numero.escrever(300000000));
		assertEquals("quatrocentos milhoes", numero.escrever(400000000));
		assertEquals("quinhentos milhoes", numero.escrever(500000000));
		assertEquals("seicentos milhoes", numero.escrever(600000000));
		assertEquals("setecentos milhoes", numero.escrever(700000000));
		assertEquals("oitocentos milhoes", numero.escrever(800000000));
		assertEquals("novecentos milhoes", numero.escrever(900000000));
	
	}
	
	@Test
	public void testMilhao() {
		

		assertEquals("um milhao dois mil trezentos e trinta", numero.escrever(1002330));
		assertEquals("vinte e tres milhoes tres mil cento e vinte", numero.escrever(23003120));
		assertEquals("novecentos e oitenta e um milhoes quatro mil e um", numero.escrever(981004001));
		assertEquals("quinze milhoes cinco mil quatrocentos e vinte e dois", numero.escrever(15005422));

		
		assertEquals("sete milhoes dez mil e dois", numero.escrever(7010002));
		assertEquals("trinta e cinco milhoes doze mil e quinhentos", numero.escrever(35012500));
		assertEquals("quatrocentos milhoes trinta e quatro mil e trezentos", numero.escrever(400034300));
		assertEquals("cinquenta milhoes quarenta mil e vinte", numero.escrever(50040020));
		assertEquals("um milhao cinquenta e dois mil duzentos e trinta e um", numero.escrever(1052231));


		assertEquals("vinte e um milhoes cem mil e trezentos", numero.escrever(21100300));
		assertEquals("sessenta e sete milhoes cento e dois mil e um", numero.escrever(67102001));
		assertEquals("tres milhoes duzentos e vinte e dois mil duzentos e vinte e dois", numero.escrever(3222222));
		assertEquals("oitenta e cinco milhoes trezentos e quarenta mil e setenta e um", numero.escrever(85340071));
		assertEquals("quatrocentos milhoes e quatro", numero.escrever(400000004));
		assertEquals("cinquenta e um milhoes quinhentos e dois mil duzentos e trinta", numero.escrever(51502230));
		assertEquals("novecentos e noventa e nove milhoes novecentos e noventa e nove mil novecentos e noventa e nove", numero.escrever(999999999));
		assertEquals("um bilhao", numero.escrever(1000000000));

	
	}

}
