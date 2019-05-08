
public class Naive {
    private String content;
    private String word;

    public Naive(String content, String word) {
        this.content = content;
        this.word = word;

    }

    public Integer searchFile() {
        Integer n;
        Integer m;
        n = this.content.length();
        m = this.word.length();
        for (Integer i = 0; i < n - m; i++) {
            Integer j = 0;
            while (j < m && this.content.charAt(i + j) == this.word.charAt(j)) {
                j++;
            }
            if (j == m)
                return i;
        }
        return 0;
    }
}