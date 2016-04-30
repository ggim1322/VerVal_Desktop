/**
 * 
 */
package loganalyser;

/**
 * @author G�zsa Gerg�
 * @code ggim1322
 **/
public class FakeLogAnalyser extends LogAnalyser {
	private FileManager fileManager;

	public FakeLogAnalyser(FileManagerClass fileManager) {
	        this.fileManager = fileManager;
	    }

	@Override
	public FileManager getFileManager() {
		return fileManager;
	}
}
