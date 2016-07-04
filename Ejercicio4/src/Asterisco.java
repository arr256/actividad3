public class Asterisco {

	public static String TextoAsterisco (int x)
	{
		String cadena ="";
		if (x>=0)
		{
			for (int i=0;i<x;i++)
			{
				cadena = cadena + "*";
				
			}
			return cadena;
			
		}
		return "numero erroneo";
		
	}
}
