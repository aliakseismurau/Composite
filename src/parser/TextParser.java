package parser;

import component.ComponentType;
import component.TextComponent;
import component.TextComposite;

public class TextParser extends AbstractParser {

    private final static String REGEX_PARAGRAPH_SPLIT = "\n\t";

    public TextParser(){
        super(new ParagraphParser());
    }

    @Override
    public TextComponent parse(String text) {
        TextComponent componentParagraphs = new TextComposite(ComponentType.TEXT);
        String[] paragraphs = text.split(REGEX_PARAGRAPH_SPLIT);
        for (String paragraph : paragraphs) {
            TextComponent componentParagraph = nextParser.parse(paragraph);
            componentParagraphs.add(componentParagraph);
        }
        return componentParagraphs;
    }
}
