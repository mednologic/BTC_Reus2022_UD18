package MainApp;

/**
 * @author Octavio, David, Uri
 * @date 29/04/2022
 * @version 0.0.1
 */
import java.sql.SQLException;

import View.ViewSelector;

public class MainApp {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		ViewSelector.selectorVistas();

	}
}
