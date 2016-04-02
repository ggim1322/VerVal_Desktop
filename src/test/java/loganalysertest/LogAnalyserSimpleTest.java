package loganalysertest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import loganalyser.LogAnalyser;

public class LogAnalyserSimpleTest {

	private LogAnalyser logA;
	
	@Before
    public void setUp() throws Exception {
        logA = new LogAnalyser();
    }

    @After
    public void tearDown() throws Exception {}
	
	@Test
	public void isValidLogFileName_ReturnTrue() {
		assertEquals(true, logA.isValidLogFileName("testFileName.str"));
	}
	
	@Test
	public void isValidLogFileName_ReturnFalse() {
		assertEquals(false, logA.isValidLogFileName("testFileName.str2"));
	}

}
