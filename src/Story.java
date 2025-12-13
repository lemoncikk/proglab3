import java.util.ArrayList;
import java.util.Objects;

public class Story {
    private ArrayList<Sentence> sentences = new ArrayList<>();
    public Story() {};
    public String generateStory() {
        var out = new StringBuilder();
        for (var i : sentences) {
            out.append(i.toString());
        }
        return out.toString();
    }

    public void addSentance(Sentence s) {
        sentences.add(s);
    }

    @Override
    public String toString() {
        return generateStory();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Story story = (Story) o;
        return (Objects.equals(sentences, story.sentences) && hashCode() == story.hashCode());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(sentences);
    }
}
