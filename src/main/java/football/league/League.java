package football.league;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class League {

    private String leagueName;
    private Map<Team, Integer> teams = new HashMap<Team, Integer>();
    private List<Match> pastMatches = new ArrayList<Match>();

    public League(String leagueName) {
        this.leagueName = leagueName;
    }

    public League(String leagueName, Map<Team, Integer> teams) {
        this.leagueName = leagueName;
        this.teams = teams;
    }

    public void addTeamtoLeague(Team team) {
        teams.put(team, 0);
    }

    public void removeTeamFromLeague(Team team) {
        teams.remove(team);
    }

    public void addPointToTeam(Team team, Integer points) {
        teams.put(team, teams.get(team) + points);
    }
}

