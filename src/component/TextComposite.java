package component;

import java.util.ArrayList;
import java.util.List;

public class TextComposite implements TextComponent {

    private static final String SPACE = " ";
    private static final String INDENT = "    ";
    private static final String LINE_BREAK = "\n";

    private final ComponentType componentType;
    private final List<TextComponent> components;

    public TextComposite(ComponentType componentType) {
        components = new ArrayList<>();
        this.componentType = componentType;
    }

    @Override
    public boolean add(TextComponent textComponent) {
        return components.add(textComponent);
    }

    @Override
    public boolean remove(TextComponent textComponent) {
        return components.remove(textComponent);
    }

    @Override
    public ComponentType getComponentType() {
        return componentType;
    }

    @Override
    public int size() {
        return components.size();
    }

    @Override
    public List<TextComponent> getComponents() {
        return components;
    }

    @Override
    public String buildText() {
        StringBuilder stringComponents = new StringBuilder();
        for (TextComponent textComponent: components) {
            switch (textComponent.getComponentType()) {
                case PARAGRAPH:
                    stringComponents.append(LINE_BREAK + INDENT);
                    break;

                case LEXEME:
                    stringComponents.append(SPACE);
                    break;
            }
            stringComponents.append(textComponent.toString());
        }
        return stringComponents.toString();
    }
}
