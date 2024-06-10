package stromnetz.network;

import breitband.preset.ImmutableList;
import breitband.preset.Move;
import breitband.preset.networking.C2SConnection;

import java.io.IOException;
import java.io.Reader;
import java.net.Socket;

/**
 * @author PaintableToast
 * @date 10.06.2024 17:14
 */
public class Server extends C2SConnection {

    public Server(Socket connection, String projectName) throws IOException {
        super(connection, projectName);
    }

    @Override
    protected void onInit(Reader reader, ImmutableList<String> immutableList, ImmutableList<String> immutableList1, int i) throws Exception {

    }

    @Override
    protected Move onRequest() throws Exception {
        return null;
    }

    @Override
    protected void onUpdate(Move move) throws Exception {

    }

    @Override
    protected int onGetScore(boolean b) throws Exception {
        return 0;
    }

    @Override
    protected String onGetName() throws Exception {
        return null;
    }

    @Override
    protected void onVerifyGame(ImmutableList<Integer> immutableList) throws Exception {

    }
}
