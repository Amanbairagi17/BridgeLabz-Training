package TestCases;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;
import org.junit.jupiter.api.Test;

import com.junit.FileProccessor;

class FileProcessorTest {
	@Test
    void testWriteAndReadFile() throws IOException {
        FileProccessor processor = new FileProccessor();
        String filename = "name.txt";
        String content = "Hello";

        processor.writeToFile(filename, content);
        String result = processor.readFromFile(filename);

        assertEquals(content, result);
    }

    @Test
    void testFileExistsAfterWriting() throws IOException {
        FileProccessor processor = new FileProccessor();
        String filename = "existstest.txt";

        processor.writeToFile(filename, "Test Content");

        File file = new File(filename);
        assertTrue(file.exists());
    }

    @Test
    void testReadFileThatDoesNotExist() {
    	FileProccessor processor = new FileProccessor();
        String filename = "xyz.txt";

        assertThrows(IOException.class, () -> {
            processor.readFromFile(filename);
        });
    }
}
