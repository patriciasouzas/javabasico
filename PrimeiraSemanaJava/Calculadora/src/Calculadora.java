/**
 * @author patri
 *
 */
public class Calculadora {

	/**
	 * @param args
	 */
		static int valorPadraoMultiplicacao = 2;

	    float valorPadraoSoma = 3.3f;

	    static int valorPadraoSomaInteiro = (int) 3.4f;

	    public static int realizarMultiplicacao(int valor) {
	        return valor * valorPadraoMultiplicacao;
	    }

	    public float realizaSoma(int valor){
	        return valor + this.valorPadraoSoma;
	    }
	}
