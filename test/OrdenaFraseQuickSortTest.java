import static org.junit.Assert.*;

import org.junit.Test;


public class OrdenaFraseQuickSortTest{

	
	@Test
	public void deveQuebrarLinhaLajota() {
		String frase = OrdenaFraseQuickSort.ordenar("A lajota quando cai quebra.");
		assertEquals("A cai quando lajota quebra.", frase);
	}
	
	@Test
	public void deveQuebrarLinhaCadeira() {
		String frase = OrdenaFraseQuickSort.ordenar("A cadeira serve para sentar.");
		assertEquals("A para serve sentar. cadeira", frase);
	}
	
	@Test
	public void deveQuebrarLinhaJabuti1() {
		String frase = OrdenaFraseQuickSort.ordenar("Um pequeno jabuti xereta viu dez cegonhas felizes.");
		assertEquals( "Um viu dez xereta jabuti pequeno felizes. cegonhas", frase);
	}
	
}
