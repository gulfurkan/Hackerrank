import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ComparatorSolution {
    private class _Player {
        String name;
        int score;

        _Player(String name, int score) {
            this.name = name;
            this.score = score;
        }
    }

    private class _Checker implements Comparator<_Player> {
        @Override
        public int compare(_Player first, _Player second) {
            int i = second.score-first.score;
            if (i != 0)
                return i;
            return first.name.compareTo(second.name);
        }

    }

    public void run(Scanner scan) {
        int n = scan.nextInt();

        _Player[] player = new _Player[n];
        _Checker checker = new _Checker();

        for (int i = 0; i < n; i++) {
            player[i] = new _Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(player, checker);
        for (int i = 0; i < player.length; i++) {
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}
