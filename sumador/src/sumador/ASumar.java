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

	
	public int total() {
        int suma = 0;

        for (int i = 0; i < valor_inicial.length(); i++) {
            // Cadena de un dígito.
            String digito = valor_inicial.substring(i, 1);
            suma = suma + Integer.getInteger(digito);
        }
        return suma;

    }
	
	/**
	 * Muestra los valores junto al sumatorio
	 * @return muestra el valor junto a la suma
	 */
	public String mostrar() {
		String numero = valor_inicial;
		String cadena ="";
        if (numero.length() == 1) {
            return (numero + " = " + numero);
        } else if(Integer.parseInt(numero) < 0) {
        	return null;
        } else if(numero.length()>0) {
        	for (int i = 0; i < valor_inicial.length(); i++) {       
            
            cadena = valor_inicial.substring(i, i+1) + " + ";
        	}
        	return cadena + " = " + total();
        }
		return null;
	}

}
