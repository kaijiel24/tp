package seedu.ecardnomics.command.normal;


import seedu.ecardnomics.Ui;
import seedu.ecardnomics.deck.Deck;
import seedu.ecardnomics.deck.DeckList;

public class CreateCommand extends NormalCommand {
    Deck newDeck;

    public CreateCommand(DeckList deckList, Deck deck) {
        super(deckList);
        newDeck = deck;
    }

    @Override
    public void execute() throws Exception {
        deckList.addDeck(newDeck);
        Ui.printNewDeck(newDeck);
    }
}
