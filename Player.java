package objects;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class Player {
    private String name;
    private String nickname;
    private HashMap<Game, Date> games;
    private List<Game> futurePurchases;
    
 // getters and setters
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public HashMap<Game, Date> getGames() {
		return games;
	}
	public void setGames(HashMap<Game, Date> games) {
		this.games = games;
	}
	public List<Game> getFuturePurchases() {
		return futurePurchases;
	}
	public void setFuturePurchases(List<Game> futurePurchases) {
		this.futurePurchases = futurePurchases;
	}

}
