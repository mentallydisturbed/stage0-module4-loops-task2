package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        int sz = chars.length;
        int counter = 0;
        while(counter < sz) {
            System.out.print(chars[counter++]);
        }
    }
}
