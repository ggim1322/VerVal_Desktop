/**
 * 
 */
package fakeLogAnaliser;

import loganalyser.FileManager;

/**
 * @author G�zsa Gerg�
 * @code ggim1322
 **/
public class FakeFileManager implements FileManager {
	public boolean isValid(String fileName) {
		return false;
	}
}
