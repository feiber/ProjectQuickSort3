/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.swing.JOptionPane;

/**
 *
 * @author Jo�o Pedro
 * @author Nathan
 * 
 */
public class OrdenaFraseQuickSort {
   
	/**
	 * 
	 * @param args    m�todo de inicializa��o
	 * @param frase   recebe o texto digitado por imput.
	 * @param fraseOrdenada   recebe m�todo ordernar.
	 * 
	 */
	
    public static void main(String[] args) {
    	String frase = null;
    	frase = JOptionPane.showInputDialog(null,"Digite uma frase: ");
    	String fraseOrdenada = ordenar(frase);
    	JOptionPane.showMessageDialog(null,"Frase Ordenada: \n"+fraseOrdenada); 
    }
    
    /**
     * 
     * @param frase    envio do m�todo main para ordena��o.
     * @param vetor[]  recebe frase particionada por espa�o causada por split.
     * @return fraseOrdenada  retorno com frase reorganizada de acordo com ordem crescente.
     */
    
    public static String ordenar(String frase){
    	
    	 String fraseOrdenada = "";
    	 String[] vetor = frase.split(" ");
              
         quickSort(vetor, 0, vetor.length - 1);

 		for (int i = 0; i < vetor.length; i++) {
 			fraseOrdenada += " " + vetor[i];
 		}
             
       return fraseOrdenada.trim();
    }
    
    /**
     * 
     * @param vetorFrase[] recebe frase particionada.
     * @param esquerda recebe posi��o inicial.
     * @param direita	recebe posi��o final.
     */
    
    public static void quickSort(String vetorFrase[], int esquerda, int direita) {
		int esq = esquerda;
		int dir = direita;
		int pivo = vetorFrase[(esq + dir) / 2].length();
		String[] troca = new String[1];

		while (esq <= dir) {
			while (vetorFrase[esq].length() < pivo) {
				esq += 1;
			}
			while (vetorFrase[dir].length() > pivo) {
				dir -= 1;
			}
			if (esq <= dir) {
				troca[0] = vetorFrase[esq];
				vetorFrase[esq] = vetorFrase[dir];
				vetorFrase[dir] = troca[0];
				esq = esq + 1;
				dir = dir - 1;
			}
		}
		
		if (dir >= esquerda){
			quickSort(vetorFrase, esquerda, dir);
		}
		if (esq < direita){
			quickSort(vetorFrase, esq, direita);
		}
	}
    
    
    
    
    
}
