package lesson27;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Text {
    public String[] text = new String[3];

    public Text(String[] text) {
        this.text = text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Text text1 = (Text) o;
        return Arrays.equals(text, text1.text);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(text);
    }

    public void getStrings(String[] text, Search func) {
        for (String string : text) {
            func.getString(string);
        }
    }
}
