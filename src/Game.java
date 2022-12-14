public class Game {
    //complete deck and player first
    private Player p1;
    private Player p2;
    private Card currentCard;
    private Player[] players;
    public void Game() {

        String rank[] = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "J", "Q", "K", "A", "2", "3", "4", "5", "6", "7",
                "8", "9", "J", "Q", "K", "A", "2", "3", "4", "5", "6", "7", "8", "9", "J", "Q", "K", "A", "2", "3", "4",
                "5", "6", "7", "8", "9", "J", "Q", "K"};
        String suits[] = {"Hearts", "Hearts", "Hearts", "Hearts", "Hearts", "Hearts", "Hearts", "Hearts", "Hearts", "Hearts",
                "Hearts", "Hearts", "Clubs", "Clubs", "Clubs", "Clubs", "Clubs", "Clubs", "Clubs", "Clubs", "Clubs", "Clubs",
                "Clubs", "Clubs", "Spades", "Spades", "Spades", "Spades", "Spades", "Spades", "Spades", "Spades", "Spades",
                "Spades", "Spades", "Spades", "Diamonds", "Diamonds", "Diamonds", "Diamonds", "Diamonds", "Diamonds",
                "Diamonds", "Diamonds", "Diamonds", "Diamonds", "Diamonds", "Diamonds"};
        int values[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 1, 2, 3, 4, 5, 6, 7,
                8, 9, 10, 10, 10};
        public Deck = new Deck(rank, suits, values)
                currentCard = shiffled
}
public void playGame()
{
    turn = i;
    //outer game loop
    while gameNotOver
        // Check if any player has no cards left
    for (player : players) {
        if player.hand.length == 0:
        System.out.println(player.name + "wins!");
        return;
    }
    // Print current card and suit player has
    for (Card: player.hand)
    {
        System.out.println(card);

}
}
