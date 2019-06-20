import org.junit.Assert;
import org.junit.Test;
import ticGameHexagonal.Board;
import ticGameHexagonal.domain.CellState;
import ticGameHexagonal.domain.GameFasade;
import ticGameHexagonal.domain.Input;

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


        //when

        GameFasade gameFasade = new GameFasade(testInput);
        //TODO kiedy i jak wybieramy repo no i czy repo ma mic size w konstruktorze
        gameFasade.startGame(testInput, new Board(5));

        //than
        //TODO nie get repo tylko dto zrób
        //TODO jak wydobywać size tez dto jest potrzebne teraz wpisalam recznie
        for (int i = 1; i < 5 + 1; i++) {
            for (int j = 0; j < 5 + 1; j++) {
                Assert.assertEquals("board filled with empty cells", gameFasade.getRepo().getAt(i, j), CellState.EMPTY);
            }
        }

    }
}
