package stromnetz.player;

import breitband.preset.ImmutableList;
import breitband.preset.Move;
import breitband.preset.Player;

import java.io.Reader;

/**
 * @author PaintableToast
 * @date 10.06.2024 17:10
 */
public class GamePlayer implements Player {
    private String name;
    private Move move;
    private int score;

    @Override
    public String getName() throws Exception {
        return name;
    }

    @Override
    public void init(Reader reader, ImmutableList<String> immutableList, int i, int i1) throws Exception {

    }

    @Override
    public Move request() throws Exception {
        return move;
    }

    @Override
    public void update(Move move) throws Exception {

    }

    @Override
    public int getScore(boolean b) throws Exception {
        return score;
    }

    @Override
    public void verifyGame(ImmutableList<Integer> immutableList) throws Exception {

    }
}
