package component;

import java.util.List;

public interface TextComponent {
    boolean add(TextComponent textComponent);
    boolean remove(TextComponent textComponent);
    ComponentType getComponentType();
    int size();
    List<TextComponent> getComponents();
    String buildText();
}
