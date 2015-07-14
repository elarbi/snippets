package my.java.dp.construct._11;

public class RegistreWindows {

	private RegistreWindows _instance;

	synchronized public RegistreWindows instance() {
		if (_instance == null) {
			_instance = new RegistreWindows();
		}
		return _instance;

	}
	


}
