package parser;

import component.ComponentType;
import component.TextComponent;
import component.TextComposite;

public class SentenceParser extends AbstractParser {
    private final static String REGEX_LEXEME_SPLIT = " ";

    public SentenceParser(){
        super(new LexemeParser());
    }

    @Override
    public TextComponent parse(String text) {
        TextComponent componentLexemes = new TextComposite(ComponentType.SENTENCE);
        String[] lexemes = text.split(REGEX_LEXEME_SPLIT);
        for (String lexeme : lexemes) {
            TextComponent componentLexeme = nextParser.parse(lexeme);
            componentLexemes.add(componentLexeme);
        }
        return componentLexemes;
    }
}
