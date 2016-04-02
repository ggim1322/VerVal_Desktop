package loganalyser;

/**
 * Created by Gazsa Gergo on 2/29/16.
 */
public class LogAnalyser {

    public static final String SUF = ".str";

    public boolean isValidLogFileName(String fileName){
        if(fileName != null){
            if(fileName.length() < SUF.length()){
                throw new IllegalArgumentException("The file name is too short.");
            }
            return fileName.endsWith(SUF);
        }
        return false;
    }

}