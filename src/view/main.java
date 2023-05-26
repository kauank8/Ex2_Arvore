package view;

import br.com.kauanPaulino.ArvoreInt.Arvore;

public class main {
	
	public static void main(String[] args) {
		int vt[] = {33, 15, 41, 38, 47, 34, 49, 43};
		Arvore arv = new Arvore();
		for(int i : vt) {
		arv.insert(i);	
		}
		try {
			arv.prefixSearch();
			System.out.println("\n========================================");
			arv.infixSearch();
			System.out.println("\n========================================");
			arv.postfixSearch();
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		
	}
}
