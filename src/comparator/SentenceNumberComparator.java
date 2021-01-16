package comparator;

import component.TextComponent;

import java.util.Comparator;

public class SentenceNumberComparator implements Comparator<TextComponent> {

    @Override
    public int compare(TextComponent o1, TextComponent o2) {
        return Integer.compare(o1.size(), o2.size());
    }
}
