import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class MarkdownParseTest {
    @Test
    public void testLabAgain() throws IOException {
        String contents = Files.readString(Path.of("C:/Users/15624/OneDrive/Documents/GitHub/markdown-parse/test-with-double-paren.md"));
        List<String> expect = List.of("br()om.org", "haha.com");
        assertEquals(expect, MarkdownParse.getLinks(contents));
    }
}