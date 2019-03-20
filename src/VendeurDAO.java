import java.util.List;

public class VendeurDAO {
	
	public static void main(String[] args) 
	{
			
		VendeurDAO vendeurDAO = new VendeurDAO();
		ListeVendeur listeVendeur = vendeurDAO.listeVendeur(); // Le votre
		List<Vendeur> listeVendeur = vendeurDAO.listerVendeurs();
		for(Vendeur vendeur : listeVendeur)
		{
			System.out.println(vendeur.getNom());
		}
		
	}

}
