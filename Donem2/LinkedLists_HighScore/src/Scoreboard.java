public class Scoreboard {
    private int numEntries = 0;
    private GameEntry[] board;

    public Scoreboard(int capacity) {
        board = new GameEntry[capacity];
    }

    public void add(GameEntry e) {
        int newScore = e.getScore();

        if (numEntries < board.length || newScore > board[numEntries - 1].getScore()) {
            if (numEntries < board.length) {
                numEntries++;
            }
            int j = numEntries - 1;
            while (j > 0 && board[j - 1].getScore() < newScore) {
                board[j] = board[j - 1];
                j--;
            }
            board[j] = e;
        }
    }

    public GameEntry remove(int i) throws IndexOutOfBoundsException {
        if (i < 0 || i >= numEntries) {
            throw new IndexOutOfBoundsException("Invalid index: " + i);
        }
        GameEntry temp = board[i];
        for (int j = i; j < numEntries - 1; j++) {
            board[j] = board[j + 1];
        }
        board[numEntries - 1] = null;
        numEntries--;
        return temp;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");

        for (int j = 0; j < numEntries; j++) {
            if (j > 0)
                sb.append(", ");
            sb.append(board[j]);
        }
        sb.append("]");
        return sb.toString();
    }

    public static void main(String[] args) {
        Scoreboard highscores = new Scoreboard(5);
        String[] names = { "Rob", "Mike", "Rose", "Jill", "Jack", "Anna", "Paul", "Bob" };
        int[] scores = { 750, 1105, 590, 740, 510, 660, 720, 400 };
        for (int i = 0; i < names.length; i++) {
            GameEntry ge = new GameEntry(names[i], scores[i]);
            System.out.println("Adding" + ge);
            highscores.add(ge);
            System.out.println("Scoreboard: " + highscores);
        }
        System.out.println("Remove score at index: " + 3);
        highscores.remove(3);
        System.out.println(highscores);
        System.out.println("Remove score at index: " + 0);
        highscores.remove(3);
        System.out.println(highscores);
        System.out.println("Remove score at index: " + 1);
        highscores.remove(3);
        System.out.println(highscores);
        System.out.println("Remove score at index: " + 1);
        highscores.remove(3);
        System.out.println(highscores);
        System.out.println("Remove score at index: " + 0);
        highscores.remove(3);
        System.out.println(highscores);
    }
}