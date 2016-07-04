public class Login {

	public boolean log(String username, String password)
	{
		if (username != "" && password!= "") 
		{
			if (username.length()<30 && password.length()<30)	
			{
				if(username.equals(password))
				{
					compruebaLoginenBD(username, password);
					return false;
				}
				return true;
			}
		
			
		}
		return false;
		
	}

	private boolean compruebaLoginenBD(String username, String password) {
			return false;
	}
}