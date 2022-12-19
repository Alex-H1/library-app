package filereader;


import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.util.Hashtable;
import java.util.List;

public class TextReader {
    public final static Logger LOG = LogManager.getLogger(TextReader.class);

    public static void main(String[] args) throws IOException {
        File file = new File("src/main/java/filereader/text.txt");
        File output = new File("src/main/java/filereader/output.txt");
        try {
            List<String> lines = FileUtils.readLines(file, "UTF-8");
            int wordCount = uniqueWords(lines);
            LOG.info(wordCount);
            FileUtils.write(output, "Unique word count:  " + wordCount, "UTF-8");
        } catch (IOException e) {
            LOG.error(e);
        }

    }

    public static int uniqueWords(List<String> content) {
        Hashtable<String, Boolean> uniqueWords = new Hashtable<>();
        for (String line : content) {
            line = StringUtils.lowerCase(line);
            String temp = "";
            for (int i = 0; i < line.length(); i++) {
                if (Character.isAlphabetic(line.charAt(i))) {
                    temp += line.charAt(i);
                } else if (!uniqueWords.containsKey(temp)) {
                    uniqueWords.put(temp, true);
                } else {
                    temp = "";
                }

            }

        }
        return uniqueWords.size();
    }


}
