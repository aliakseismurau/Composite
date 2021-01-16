package parser;

import component.ComponentType;
import component.TextComponent;
import component.TextComposite;

public class ParagraphParser extends AbstractParser{

    private final static String REGEX_SENTENCE_SPLIT = ".+?([.]{3}|[.!?])";

    public ParagraphParser(){
        super(new SentenceParser());
    }

    @Override
    public TextComponent parse(String text) {
        TextComponent componentSentences = new TextComposite(ComponentType.PARAGRAPH);
        String[] sentences = text.split(REGEX_SENTENCE_SPLIT);
        for (String sentence : sentences) {
            TextComponent componentSentence = nextParser.parse(sentence);
            componentSentences.add(componentSentence);
        }
        return componentSentences;
    }
}
