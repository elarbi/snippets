package my.java.dp.construct._13.test;

import my.java.dp.construct._13.MySQLConnection;
import my.java.dp.construct._13.OracleConnection;
import my.java.dp.construct._13.SGBD;

public class Test {

	public static void main(String[] args) {
	//create a connection
	SGBD sgbdServer = new SGBD();
	
	sgbdServer.addConnexion(new MySQLConnection().createConnection());
	sgbdServer.addConnexion(new OracleConnection().createConnection());

	
	//close it
	}

}