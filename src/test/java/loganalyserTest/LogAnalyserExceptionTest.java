package loganalyserTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import loganalyser.LogAnalyser;

public class LogAnalyserExceptionTest {

	private LogAnalyser logA;

	@Before
	public void setUp() throws Exception {
		logA = new LogAnalyser();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test(expected = IllegalArgumentException.class)
	public void isValidLogFileName_TooShort_ExceptionThrown() throws Exception {
		logA.isValidLogFileName("");
	}

}
