//Semester: #A171
//Course: #STIW3054
//Group: #A
//Task: #Assignment1
//Matrik: #239920
//Name: #Kok Chin Onn
package assignmentone;

public class AssignmentOne {
    
    public static void main(String[] args) throws Exception{
       
        CountFiles countFiles = new CountFiles();
        String[] countJavaFile =countFiles.countJavaFile;
        
        CountIssue countIssue = new CountIssue();
        countIssue.File(countJavaFile);
        
        System.out.println("Number of Java Files = " + countIssue.totalJava);
        System.out.println("Number of Issues = " + countIssue.noIssue);
    }
    
}
