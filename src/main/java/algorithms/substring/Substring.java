package algorithms.substring;

public class Substring {

    public int substring(String a, String b) {
        if(!b.contains(a))
            return -1;
        int repetitionsCount = 0;
        StringBuilder word = new StringBuilder(a);

        while (!word.toString().contains(b)) {
            repetitionsCount++;
            word.append(a);

        }
        if (word.toString().contains(b)) {
            repetitionsCount++;
            return repetitionsCount;
        }
        return -1;
    }
}
