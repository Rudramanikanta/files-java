import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

import java.util.*;
class Sample2 {
    public static void main(String[] args) throws FileNotFoundException {
        File f=new File("Sample.txt");
        Scanner read=new Scanner(f);
        String[] fileNames = new String[5];
        for(int i=0;i<5;i++){
            fileNames[i]=read.nextLine();
        }
        Hierarchy h=new Hierarchy();
        h.spacing(fileNames);

        // Create a map to store the parent-child relationships
        
    }
}
class Hierarchy{
    void spacing(String fileNames[]){
        Map<String, String> fileMap = new HashMap<>();
        fileMap.put("File1", null);

        for (int i = 1; i < fileNames.length; i++) {
            String currFile = fileNames[i].trim();
            int numSpaces = fileNames[i].length() - currFile.length();

            if (numSpaces == 1) {
                fileMap.put(currFile, "File1");
            } else if (numSpaces > 1) {
                String parentFile = fileNames[i-1].trim();
                fileMap.put(currFile, parentFile);
            } else {
                fileMap.put(currFile, null);
            }
        }

        // Print the output
        System.out.printf("%-10s %-10s\n", "FileName", "ParentFile");
        System.out.println("========== ==========");
        for (String file : fileMap.keySet()) {
            System.out.printf("%-10s %-10s\n", file, fileMap.get(file));
        }
    }
    }