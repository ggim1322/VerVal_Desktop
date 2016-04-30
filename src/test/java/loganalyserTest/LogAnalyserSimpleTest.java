package loganalyserTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import fakeLogAnaliser.FileManagerFactory;
import loganalyser.FakeLogAnalyser;
import loganalyser.FileManagerClass;
import loganalyser.LogAnalyser;

public class LogAnalyserSimpleTest {

	private LogAnalyser logA;
	private FileManagerClass fileManager;

	@Before
	public void setUp() throws Exception {
		// logA = new LogAnalyser();
		fileManager = new FileManagerClass();
		logA = new FakeLogAnalyser(fileManager);
		FileManagerFactory.getInstance().setFileManager(fileManager);
	}

	@After
	public void tearDown() throws Exception {
	}

	/*
	 * @Test public void isValidLogFileName_ReturnTrue() { assertEquals(true,
	 * logA.isValidLogFileName("testFileName.str")); }
	 * 
	 * @Test public void isValidLogFileName_ReturnFalse() { assertEquals(false,
	 * logA.isValidLogFileName("testFileName.str2")); }
	 */

	@Test
	public void isValidLogFileName_NotValid_ReturnFalse() {
		fileManager.setReturnValue(false);
		assertEquals(false, logA.isValidLogFileName(""));
	}

	@Test
	public void IsValidLogFileName_Valid_ReturnTrue() {
		fileManager.setReturnValue(true);
		assertEquals(true, logA.isValidLogFileName(""));
	}

}
