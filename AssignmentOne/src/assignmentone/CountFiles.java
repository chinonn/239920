//Semester: #A171
//Course: #STIW3054
//Group: #A
//Task: #Assignment1
//Matrik: #239920
//Name: #Kok Chin Onn
package assignmentone;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class CountFiles {
    public String[] countJavaFile;
    String Path="C:\\Users\\User\\Documents\\NetBeansProjects\\AssignmentOne\\Folder";

    public CountFiles() {
        Collection<File> all = new ArrayList<>();
        addFile(new File(Path), all);
        Collection<File> a = all;
        countJavaFile = searchJava(a);
    }
    
    static void addFile(File file, Collection<File> all) {
        File[] children = file.listFiles();
        if (children != null) {
            for (File child : children) {
                all.add(child);
                addFile(child, all);
            }
        }
    }

    static String[] searchJava(Collection<File> listAllFileName){
        LinkedList<String> file = new LinkedList();
        Iterator<File> a = listAllFileName.iterator();
        File b;
        while (a.hasNext()) {
            b = a.next();
            if (b.getName().contains(".java")) {
                file.add(b.getAbsolutePath());
            }
        }
        String[] countJavaFile;
        countJavaFile = new String[file.size()];
        for (int i = 0; i < file.size(); i++) {
            countJavaFile[i] = file.get(i);
        }
        return countJavaFile;
    }
}
