package loganalyserTest;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import logAnalyser.LogAnalyser;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by Gazsa Gergo on 2/29/16
 */
@RunWith(Parameterized.class)
public class LogAnalyserParameterizedTest {

	public String fileName;
	public boolean expectedReturn;

	public LogAnalyserParameterizedTest(String fileName, boolean expectedReturn) {
		this.fileName = fileName;
		this.expectedReturn = expectedReturn;
	}

	@Parameters
	public static Collection<Object[]> testData() {
		Object[][] data = new Object[][] { { "testFileName.str1", false }, { "testFileName.str", true },
				{ "testFileName.str2", false } };
		return Arrays.asList(data);
	}

	private LogAnalyser logA;

	@Before
	public void setup() throws Exception {
		logA = new LogAnalyser();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void isValidLogFileName_ValidName_ReturnsTrue() throws Exception {
		assertEquals(expectedReturn, logA.isValidLogFileName(fileName));
	}

}