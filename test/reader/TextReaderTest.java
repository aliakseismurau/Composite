package reader;

import exception.ReaderException;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class TextReaderTest {

    TextReader reader = new TextReader();

    @Test
    public void testReadData() throws ReaderException{
        List<String> lines = new ArrayList<>();
        lines.add("    It has survived - not only (five) centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the “Динамо” (Рига)");
        lines.add("with the release of Letraset sheets.toString() containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker Faclon9 including");
        lines.add("versions of Lorem Ipsum!");
        lines.add("    It is a long a!=b established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Ipsum is that it has a");
        lines.add("more-or-less normal distribution ob.toString(a?b:c), as opposed to using (Content here), content here's, making it look like readable English?");
        lines.add("    It is a established fact that a reader will be of a page when looking at its layout...");
        lines.add("    Bye бандерлоги.");
        List<String> actual = reader.readData("res/data.txt");
        List<String> expected = lines;
        Assert.assertEquals(actual, expected);
    }
}
