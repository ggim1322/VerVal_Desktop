/**
 * 
 */
package webService;

/**
 * @author G�zsa Gerg�
 * @code ggim1322
 **/
public class ManualWebService implements WebService {
	private String lastError;

	public void logError(String error) {
		lastError = error;
	}

	public String getLastError() {
		return lastError;
	}
}
