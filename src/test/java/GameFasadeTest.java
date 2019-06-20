import org.junit.Assert;
import org.junit.Test;
import ticGameHexagonal.ArrayRepo;
import ticGameHexagonal.ArrayRepoAdapter;
import ticGameHexagonal.domain.CellState;
import ticGameHexagonal.domain.GameFasade;
import ticGameHexagonal.domain.Input;
import ticGameHexagonal.domain.Repository;

public class GameFasadeTest {
    //UC 1 - Start Game Tests

    @Test
    public void EmptyBoardIsDelivered() {
        // given
        Input testInput = new Input();
        testInput.setPlayerOneName("Tom");
        testInput.setPlayerOneSymbol("O");
        testInput.setPlayerTwoName("Jerry");
        testInput.setSize(5);
        Repository testRepository= new ArrayRepoAdapter(5);

        //when

        GameFasade gameFasade = new GameFasade(testInput);
        gameFasade.startGame(testInput, testRepository);

        //than
        //TODO nie get repo tylko dto zrób
        //TODO jak wydobywać size tez dto jest potrzebne teraz wpisalam recznie
        for (int i = 1; i < 5 + 1; i++) {
            for (int j = 1; j < 5 + 1; j++) {
                Assert.assertEquals("board filled with empty cells", gameFasade.getRepo().getAt(i, j), CellState.EMPTY);
            }
        }

    }
}
