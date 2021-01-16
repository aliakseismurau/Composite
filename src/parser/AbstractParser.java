package parser;

import component.TextComponent;
import component.TextComposite;

public abstract class AbstractParser {

    protected AbstractParser nextParser;

    public AbstractParser () {
    }

    public AbstractParser (AbstractParser nextParser) {
        this.nextParser = nextParser;
    }

    public abstract TextComponent parse(String text);
}
