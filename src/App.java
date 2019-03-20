import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	public static void main (String[] args)
	{
		ApplicationContext contexte = new ClassPathXmlApplicationContext("ListeDesArticles.xml");
		
		ListeArticle listeArticlesUne = (ListeArticle) contexte.getBean("listeArticlesUne");
		int nombreArticles = listeArticlesUne.getListeArticles().size();
		System.out.println("il y a " + nombreArticles + " articles : ");
		
		for (Articles articles : listeArticlesUne.getListeArticles())
		{
			System.out.println(articles.getNom() + " Types : " + articles.getType() + " Année de sortie : " + articles.getAnnéeSortie() );
		}
		
		
		//VueVendeur.launch(VueVendeur.class, args);
		VueMateriel.launch(VueMateriel.class, args);
	}
	
}
