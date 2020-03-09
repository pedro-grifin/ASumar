package sumador;

public class ASumar {

	private String valor_inicial;

	/**
	 * Constructor
	 * @param string valor inicial.
	 */
	public ASumar(String string) {
		this.valor_inicial = string;
	}

	/**
	 * Muestra los valores junto al sumatorio
	 * @return muestra el valor junto a la suma
	 */
	public String mostrar() {
		String numero = valor_inicial;
        if (numero.length() == 1) {
            return (numero + " = " + numero);
        } 
		return null;
	}

}
