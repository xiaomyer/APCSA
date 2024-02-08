public class HiddenWord {
    private final String word;

    public HiddenWord(String word) {
        this.word = word;
    }

    public String getHint(String guess) {
        String result = "";
        for (int i = 0; i < guess.length(); i++) {
            if (this.word.charAt(i) == guess.charAt(i)) {
                result += this.word.charAt(i);
            } else if (this.word.contains(Character.toString(
                
            
            
            
            
            guess.charAt(i)))) {
                result += "+";
            } else {
                result += "*";
            }
        }
        return result;
    }

    public static void main(String[] args) {
        HiddenWord puzzle = new HiddenWord("HARPS");
        System.out.println(puzzle.getHint("AAAAA"));
        System.out.println(puzzle.getHint("HELLO"));
        System.out.println(puzzle.getHint("HEART"));
        System.out.println(puzzle.getHint("HARMS"));
        System.out.println(puzzle.getHint("HARPS"));
    }
}
