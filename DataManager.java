package objects;
import java.util.List;

public class DataManager {
    private List<Game> games;
    private List<Author> authors;
    private List<Player> players;

    public void addGame(Game game) {
        // Aggiunge un nuovo gioco alla lista dei giochi
    	games.add(game);
    }

    public void addAuthor(Author author) {
        // Aggiunge un nuovo autore alla lista degli autori
    	authors.add(author);
    }

    public void addPlayer(Player player) {
        // Aggiunge un nuovo giocatore alla lista dei giocatori
    	players.add(player);
    }

    public List<Game> getAuthorGames(Author author) {
        // Restituisce la lista dei giochi di un determinato autore
    	List<Game> authorGames;
    	for (Game game : this.games)	{
    		for (Author a : )	{
    			if (a.equals(author))	{
    				authorGames.add(game);
    			}
    		}
    	}
    }

    public List<Game> getPlayerGames(Player player) {
        // Restituisce la lista dei giochi di un determinato giocatore
    }
}

