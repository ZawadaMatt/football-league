package football.league;

import java.util.List;

//przechowuje liste zawodników (załozmy, ze imie i nazwisko jest unikalne), ma nazwe

public class Team {

    private int id;
    private List<String> players;
    private String teamName;
    


    public Team(String teamName) {
        this.teamName = teamName;
        System.out.println("Dodano druzyne");
    }

    public Team(List<String> players, String teamName) {
        this.teamName = teamName;
        this.players = players;
        System.out.println("Dodano druzyne");
    }

    public String getTeamName() {
        return teamName;
    }
}
