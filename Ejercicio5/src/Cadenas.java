public class Cadenas {

	public static String Noesta (String cad1, String cad2)
	{
		String cad3 = "";
		boolean encontrado = false;
		
		for(int i=0; i<cad1.length();i++)
		{

			char letra = cad1.charAt(i);
			for(int j=0; j<cad2.length(); j++ )
			{
			  if (!encontrado){
				if(letra == cad2.charAt(j))
				{
					encontrado = true;
				}
				
			}
		}
		 if (!encontrado)
			 cad3 = cad3 + letra;

		}
		return cad3;
		
		
	}
}
