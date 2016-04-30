/**
 * 
 */
package fakeLogAnalyser;

import logAnalyser.FileManager;

/**
 * @author Gázsa Gergõ
 * @code ggim1322
 **/
public class FileManagerFactory {
	private static FileManagerFactory fileManagerFactory;
	private FileManager fileManager;

	private FileManagerFactory() {

	}

	public static FileManagerFactory getInstance() {
		if (fileManagerFactory == null) {
			fileManagerFactory = new FileManagerFactory();
		}
		return fileManagerFactory;
	}

	public FileManager getFileManager() {
		if (fileManager != null) {
			return fileManager;
		} else {
			return new FakeFileManager();
		}
	}

	public void setFileManager(FileManager fileManager) {
		this.fileManager = fileManager;
	}
}
