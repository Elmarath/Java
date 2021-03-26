public class GameEntry {
    private String name; // name of the person earning this score
    private int score; // the score value

    /**
     * Constructs a game entry with given parameters
     * 
     * @return String
     */
    public GameEntry(String n, int s) {
        name = n;
        score = s;
    }

    /**
     * Return the name field.
     * 
     * @return int
     */
    public String getName() {
        return name;
    }

    /**
     * Retruns the score filed.
     * 
     * @return String
     */
    public int getScore() {
        return score;
    }

    /**
     * Retruns a string representation of this entry
     * 
     * @return String
     */
    public String toString() {
        return "(" + name + ", " + score + ")";
    }
}
