package filereader;


import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class TextReader {
    public final static Logger LOG = LogManager.getLogger(TextReader.class);
    public static void main(String[] args) throws IOException {
        File file = new File("src/main/java/filereader/text.txt");

        try{
            List<String> lines = FileUtils.readLines(file, StandardCharsets.UTF_8);
            int wordCount = uniqueWords(lines);
            LOG.info(wordCount);
        }catch (IOException e){
            LOG.error(e);
        }
    }

    public static int uniqueWords(List<String> lines){
        ArrayList<String> uniqueWords= new ArrayList<>();
        for(String line : lines){
            line = StringUtils.lowerCase(line);
            for(int i = 0; i < line.length(); i++){
                String temp = "";
                temp += line.charAt(i);
                if(Character.isAlphabetic(line.charAt(i)) == false && !(uniqueWords.contains(temp))){
                    uniqueWords.add(temp);
                }
                temp = "";
            }
        }
        return uniqueWords.size();
    }


}
