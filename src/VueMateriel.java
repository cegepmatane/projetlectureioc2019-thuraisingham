import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class VueMateriel extends Application {
	
	Scene scene = null;

	@Override
	public void start(Stage vueMateriel) throws Exception {
		
		Parent racine = FXMLLoader.load(getClass().getResource("VueMateriel.fxml"));
		scene = new Scene(racine, 800, 600);
		//vueMateriel.setTitle("Vendeur");
		vueMateriel.setScene(scene);
		vueMateriel.show();
		
	}
	
	

}
