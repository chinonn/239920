//Semester: #A171
//Course: #STIW3054
//Group: #A
//Task: #Assignment1
//Matrik: #239920
//Name: #Kok Chin Onn
package assignmentone;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class CountIssue {
  
    File f;
    String fileContent[][];
    LinkedList<String> listFileContent;
    public int noIssue=0;
    public int totalJava=0;
    private int countIssue;
    private final String keyword = "public static void main";

    public void File(String[] countJavaFile) {
        for (String countJavaFile1 : countJavaFile) {
            try (final BufferedReader br = new BufferedReader(new FileReader(countJavaFile1))) {
                String readLine;
                while ((readLine = br.readLine()) != null) {
                    if (readLine.contains(keyword)) {
                        noIssue++;
                    }
                }
            }catch (IOException e) {
            }
            totalJava++;
        }  
            setIssue(noIssue);
    }   
 
    public void setIssue(int count){
            countIssue = count;
        }
        
        public int getIssue(){
            return countIssue;
        }
}
