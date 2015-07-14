package my.java.dp.construct._13;

public class MySQLConnection implements DataBaseConnection  {

	@Override
	public DataBaseConnection createConnection() {
		return new MySQLConnection();
		
	}

}
