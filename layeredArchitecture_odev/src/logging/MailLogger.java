package logging;

public class MailLogger implements BaseLogger{
	public void log(String data) {
		System.out.println("Logged to mail: " + data);
	}
}
