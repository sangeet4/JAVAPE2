import java.util.*;
import java.io.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileProg {

    public long checkLegth(String fname){
        long fLength;
        File file = new File(fname);
        fLength = file.length();
        return fLength;
    }

    public String convertToUcaseNPrint(String fname) throws IOException{
        long fLength = checkLegth(fname);
        System.out.println(fLength);
        File file = new File(fname);
        BufferedReader br;
        br = new BufferedReader(new FileReader(file));
        String reader;
        StringBuffer ret = new StringBuffer("");
        while((reader = br.readLine()) != null)
            ret = ret.append(reader.toUpperCase());
        return (new String(ret));
    }
}
