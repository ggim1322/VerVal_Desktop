/**
 * 
 */
package logAnalyser;

/**
 * @author Gázsa Gergõ
 * @code ggim1322
 **/
public class FileManagerClass implements FileManager {
	private boolean returnValue;

	@Override
	public boolean isValid(String fileName) {
		return returnValue;
	}

	public void setReturnValue(boolean returnValue) {
		this.returnValue = returnValue;
	}
}
