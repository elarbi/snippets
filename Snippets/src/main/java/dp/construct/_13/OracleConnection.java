package my.java.dp.construct._13;

public class OracleConnection implements DataBaseConnection {
	
	@Override
	public DataBaseConnection createConnection() {
		return new OracleConnection();
	}

}
