package component;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class CustomSymbol implements TextComponent{
    private static final Logger logger = LogManager.getLogger();
    private final String symbol;
    private final ComponentType componentType = ComponentType.SYMBOL;

    public CustomSymbol(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public boolean add(TextComponent textComponent) {
        logger.log(Level.ERROR, "Adding is impossible");
        return false;
    }

    @Override
    public boolean remove(TextComponent textComponent) {
        logger.log(Level.ERROR, "Removing is impossible");
        return false;
    }

    @Override
    public ComponentType getComponentType() {
        return componentType;
    }

    @Override
    public int size() {
        logger.log(Level.ERROR, "It is not allowed to use this method");
        throw new UnsupportedOperationException();
    }

    @Override
    public List<TextComponent> getComponents() {
        logger.log(Level.ERROR, "Impossible to extract from leaf");
        throw new UnsupportedOperationException();
    }

    @Override
    public String buildText() {
        return symbol;
    }
}
