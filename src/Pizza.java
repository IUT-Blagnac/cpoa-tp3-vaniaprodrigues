
import java.util.ArrayList;

public abstract class Pizza {

	protected String nom;
	protected String pate;
	protected String sauce;
	protected ArrayList<String> garnitures;

	/**
	 * 
	 */
	protected Pizza() {
		this.nom = "";
		this.pate = "";
		this.sauce = "";
		this.garnitures = new ArrayList<String>();

	}


	protected void preparer() {
		System.out.println("PreÌparation de " + this.nom );
		System.out.println("EÌtalage de la paÌ‚te...");
		System.out.println("Ajout de la sauce... ");
		System.out.println("Ajout des garnitures:");
		for (int i=0; i<garnitures.size(); i++) {
			System.out.println(" " + this.garnitures.get(i));
		}

	}

	protected void cuire() {
		System.out.println("Cuisson 25 minutes aÌ€ 180Â°");
	}

	protected void couper() {
		System.out.println("DeÌcoupage en parts" );
	}

	protected void emballer() {
		System.out.println("Emballage dans une boiÌ‚te officielle");

	}
	protected String getNom() {

		return this.nom;

	}
}
