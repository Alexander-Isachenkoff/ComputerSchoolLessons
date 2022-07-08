package lesson2_classes.examples;

import java.util.ArrayList;

public class StringList {

    ArrayList<String> arrayList = new ArrayList<>();
    String separator;
    String lineEnd;
    String listEnd;

    public StringList(String separator, String lineEnd, String listEnd) {
        this.separator = separator;
        this.lineEnd = lineEnd;
        this.listEnd = listEnd;
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < arrayList.size(); i++) {
            String end = (i == arrayList.size() - 1) ? listEnd : (lineEnd + '\n');
            result += (i+1) + separator + " " + arrayList.get(i) + end;
        }
        return result;
    }
}
