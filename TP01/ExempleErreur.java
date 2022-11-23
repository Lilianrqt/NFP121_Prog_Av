/** Une erreur à la compilation !
  * Pourquoi ?
  * @author	Xavier Crégut
  * @version	1.3
  */
public class ExempleErreur {

	/** Méthode principale */
	public static void main(String[] args) {
		// La classe ne se compilait pas car p1 n'était pas initialisé
		Point p1 = new Point(4.3,2.2);
		p1.setX(1);
		p1.setY(2);
		p1.afficher();
		System.out.println();
	}

}
