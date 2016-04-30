package logAnalyser;

import fakeLogAnalyser.FileManagerFactory;
import webService.WebService;

/**
 * Created by Gazsa Gergo on 2/29/16.
 */
public class LogAnalyser {

	// private static final String SUF = ".str";

	private WebService webService;

	public boolean isValidLogFileName(String fileName) {
		/*
		 * if(fileName != null){ if(fileName.length() < SUF.length()){ throw new
		 * IllegalArgumentException("The file name is too short."); } return
		 * fileName.endsWith(SUF); }
		 */
		// return false;

		if ((webService != null) && (fileName.length() < 3)) {
			webService.logError("File name " + fileName + " is too short.");
		}

		return this.getFileManager().isValid(fileName);
	}

	public void setWebService(WebService webService) {
		this.webService = webService;
	}

	public FileManager getFileManager() {
		return FileManagerFactory.getInstance().getFileManager();
	}

}