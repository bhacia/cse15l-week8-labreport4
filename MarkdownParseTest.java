import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class MarkdownParseTest {
    @Test
    public void MYtestSnippet1() throws IOException {
        String contents = Files.readString(Path.of("C:/Users/15624/OneDrive/Documents/GitHub/my-md-parse/snippet1.md"));
        List<String> expect = List.of("`google.com", "google.com", "ucsd.edu");
        assertEquals(expect, MarkdownParse.getLinks(contents));
    }

    @Test
    public void GROUPtestSnippet1() throws IOException {
        String contents = Files.readString(Path.of("C:/Users/15624/OneDrive/Documents/GitHub/my-md-parse/snippet1.md"));
        List<String> expect = List.of("`google.com", "google.com", "ucsd.edu");
        assertEquals(expect, MarkdownParseGroup.getLinks(contents));
    }

    @Test
    public void MYtestSnippet2() throws IOException {
        String contents = Files.readString(Path.of("C:/Users/15624/OneDrive/Documents/GitHub/my-md-parse/snippet2.md"));
        List<String> expect = List.of("a.com", "a.com(())", "example.com");
        assertEquals(expect, MarkdownParse.getLinks(contents));
    }

    @Test
    public void GROUPtestSnippet2() throws IOException {
        String contents = Files.readString(Path.of("C:/Users/15624/OneDrive/Documents/GitHub/my-md-parse/snippet2.md"));
        List<String> expect = List.of("a.com", "a.com(())", "example.com");
        assertEquals(expect, MarkdownParseGroup.getLinks(contents));
    }

    @Test
    public void MYtestSnippet3() throws IOException {
        String contents = Files.readString(Path.of("C:/Users/15624/OneDrive/Documents/GitHub/my-md-parse/snippet3.md"));
        List<String> expect = List.of("https://ucsd-cse15l-w22.github.io/");
        assertEquals(expect, MarkdownParse.getLinks(contents));
    }

    @Test
    public void GROUPtestSnippet3() throws IOException {
        String contents = Files.readString(Path.of("C:/Users/15624/OneDrive/Documents/GitHub/my-md-parse/snippet3.md"));
        List<String> expect = List.of("https://ucsd-cse15l-w22.github.io/");
        assertEquals(expect, MarkdownParseGroup.getLinks(contents));
    }
}