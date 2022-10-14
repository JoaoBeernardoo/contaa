package contaa;

import contaa.interfaces.Retangulo;

import contaa.interfaces.Quadrado;

public class testeinter{
	
	public static void main(String[] args) {
		AreaCalculavel a = new Retangulo(3,2);
		System.out.println(a.calculaArea());
		
		AreaCalculavel b = new Quadrado(5);
		System.out.println(b.calculaArea());
		
		AreaCalculavel c = new Circulo(4,5);
		System.out.println(c.calculaArea());
      
	}

}
