package logging;

public class FileLogger implements BaseLogger{
	public void log(String data) {
		System.out.println("Logged to file: " + data);
	}
}
