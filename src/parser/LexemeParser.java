package parser;

import component.ComponentType;
import component.CustomSymbol;
import component.TextComponent;
import component.TextComposite;

public class LexemeParser extends AbstractParser {

    private final static String REGEX_SYMBOL_SPLIT = "";

    @Override
    public TextComponent parse(String text) {
        TextComponent componentSymbols = new TextComposite(ComponentType.LEXEME);
        String[] symbols = text.split(REGEX_SYMBOL_SPLIT);
        for (String symbol : symbols) {
            componentSymbols.add(new CustomSymbol(symbol));
        }
        return componentSymbols;
    }
}
