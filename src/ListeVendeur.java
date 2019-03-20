public class ListeVendeur 
{
	NoeudVendeur tete = new NoeudVendeur("coop");
	NoeudVendeur queue;
	
	
	public class NoeudVendeur 
	{
		public Vendeur vendeur = null;
		public NoeudVendeur suivant = null;
		
		public NoeudVendeur(String nomVendeur)
		{
			this.suivant = null;
		}
	}
	
	public ListeVendeur()
	{
		this.queue = this.tete;
		

		System.out.println("");
	}

}
