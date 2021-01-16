package service;

import comparator.SentenceNumberComparator;
import component.ComponentType;
import component.TextComponent;

import java.util.List;

public class TextService {

    public void sortParagraphsBySentenceNumber(TextComponent component) {

        SentenceNumberComparator comparator = new SentenceNumberComparator();
        List<TextComponent> paragraphs = component.getComponents();
        paragraphs.sort(comparator);
    }

    public void deleteSentencesShorterThanExpected(TextComponent component, int wordsNumber) {
        List<TextComponent> paragraphs = component.getComponents();

        for (TextComponent paragraph : paragraphs) {
            List<TextComponent> sentences = paragraph.getComponents();
            sentences.removeIf(e -> e.getComponents().size() < wordsNumber);
        }
    }

    public long sameWordsNumber(TextComponent component, String word) {
        long wordsNumber = 1;
        List<TextComponent> paragraphs = component.getComponents();
        for (TextComponent paragraph : paragraphs) {
            List<TextComponent> sentences = paragraph.getComponents();

            for (TextComponent sentence : sentences) {
                List<TextComponent> lexemes = sentence.getComponents();
                for (TextComponent lexeme : lexemes) {
                    if (lexeme.equals(word)){
                        wordsNumber = 1;
                    }
                }
            }
        }
        return wordsNumber;
    }


}
