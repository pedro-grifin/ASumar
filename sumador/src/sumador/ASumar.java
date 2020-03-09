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
	 * calcula la suma de los digitos
	 * @return la suma total
	 */
	public int total() {
        int suma = 0;

        for (int i = 0; i < valor_inicial.length(); i++) {
            char digito = valor_inicial.charAt(i);
            suma += Character.getNumericValue(digito);
        }
        return suma;

    }
	
	/**
	 * Muestra los valores junto al sumatorio
	 * @return muestra el valor junto a la suma
	 */
	public String mostrar() {
		String numero = valor_inicial;
		StringBuffer sb = new StringBuffer();
        if (numero.length() == 1) {
            return (numero + " = " + numero);
        } else if(Integer.parseInt(numero) < 0) {
        	return null;
        } else if(numero.length()>0) {
        	for (int i = 0; i < valor_inicial.length(); i++) {
                sb.append(valor_inicial.substring(i, i+1));
                if(i+1<valor_inicial.length()) {
                	sb.append(" + ");
                	}
                }
        	sb.append(" = " + total());
        	String cadena=sb.toString();
        	return  cadena;
        }
		return  null;
	}

}
