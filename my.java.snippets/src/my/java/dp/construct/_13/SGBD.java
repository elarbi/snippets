package my.java.dp.construct._13;

import java.util.ArrayList;
import java.util.List;

public class SGBD {
	private List<DataBaseConnection> connections;

	public SGBD() {
		connections = new ArrayList<DataBaseConnection>();
	}

	public void addConnexion(DataBaseConnection connection) {

		connections.add(connection);
	}

}
