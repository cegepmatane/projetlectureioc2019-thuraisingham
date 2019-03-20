import java.util.List;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;




public class VueVendeur extends Application
{
	protected TabPane onglets = null;
	protected TextArea texte = null;
	TextArea[] tabVendeur = new TextArea[3];
	
	Scene scene=null;

	@Override
	public void start(Stage vueVendeur) throws Exception {
		
		Parent racine = FXMLLoader.load(getClass().getResource("VueVendeur.fxml"));
		scene = new Scene(racine, 800, 600);
		vueVendeur.setTitle("Vendeur");
		vueVendeur.setScene(scene);
		vueVendeur.show();
		
		this.onglets = (TabPane)scene.lookup("#menu-vendeur");

		this.tabVendeur[0] = (TextArea) this.scene.lookup("#vendeur1");
		this.tabVendeur[1] = (TextArea) this.scene.lookup("#vendeur2");
		this.tabVendeur[2] = (TextArea) this.scene.lookup("#vendeur3");
		
		this.menu("Carte Mere", 0);
		this.menu( "GPU", 1);
		this.menu("CPU", 2);
		/*this.materiel("Carte Mere", 0);
		this.materiel("GPU", 1);
		this.materiel("CPU", 2);*/
	}
	
	public void menu(String nomOnglet, int numOnglet)
	{
		this.onglets.getTabs().get(numOnglet).setText(nomOnglet);
	}
	
	/*public void materiel(String nomMateriel, int numOnglet)
	{		
		this.tabVendeur[numOnglet].setText(nomMateriel);
	}*/
}
