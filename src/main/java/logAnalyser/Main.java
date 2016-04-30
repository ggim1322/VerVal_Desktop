package logAnalyser;

/**
 * Created by Gazsa Gergo on 2/29/16.
 */
public class Main {
	public static void main(String[] args) {
		LogAnalyser logAnalyser = new LogAnalyser();
		System.out.println(logAnalyser.isValidLogFileName("file.str"));
	}
}