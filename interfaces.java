package contaa;

public  class interfaces  {
	
static class Quadrado implements AreaCalculavel {
	
		private int lado;
		
		public Quadrado(int lado) {
		this.lado = lado;
		}
		
		public double calculaArea() {
		return this.lado * this.lado;
		}
		}
	

static class Retangulo implements AreaCalculavel {
		private int largura;
		private int altura;
		
	public Retangulo(int largura, int altura) {
		this.largura = largura;
		this.altura = altura;
		}
	public double calculaArea() {
		return this.largura * this.altura;
		}
		}
	
	
	}

 class Circulo implements AreaCalculavel { 
	
		private int largura;
		private int comprimento;
		
		public Circulo(int largura, int comprimento) {
			
			this.largura = largura;
			this.comprimento = comprimento;
			
			
		}
		
		public double calculaArea() {
			return this.largura*this.comprimento*2;
		}
}


interface AreaCalculavel{
	double calculaArea();
}


