package loganalyserTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import fakeLogAnalyser.FakeLogAnalyser;
import fakeLogAnalyser.FileManagerFactory;
import logAnalyser.FileManagerClass;
import logAnalyser.LogAnalyser;
import webService.ManualWebService;
import webService.WebService;

public class LogAnalyserSimpleTest {

	private LogAnalyser logA;
	private FileManagerClass fileManager;
	private WebService webService;

	@Before
	public void setUp() throws Exception {
		// logA = new LogAnalyser();
		fileManager = new FileManagerClass();
		logA = new FakeLogAnalyser(fileManager);
		FileManagerFactory.getInstance().setFileManager(fileManager);
		webService = new ManualWebService();
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

	@Test
	public void isValidLogFileName_FileNameTooShort_ByWebService() {
		logA.isValidLogFileName("12");
		assertEquals( "File name 12 is too short.", webService.getLastError());
	}

	@Test
	public void isValidLogFileName_Mock_FileNameTooShort_ByWebService() {
		WebService mockedWebService = Mockito.mock(WebService.class);
		logA.setWebService(mockedWebService);
		logA.isValidLogFileName("12");
		Mockito.verify(mockedWebService, Mockito.times(2)).logError("File name 12 is too short.");
	}

}
