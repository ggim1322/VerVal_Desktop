/**
 * 
 */
package fakeLogAnalyser;

import logAnalyser.FileManager;

/**
 * @author Gázsa Gergõ
 * @code ggim1322
 **/
public class FakeFileManager implements FileManager {
	public boolean isValid(String fileName) {
		return false;
	}
}
