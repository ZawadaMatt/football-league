package football.league;

public class LeagueMenager {

    public static void main(String[] args) {
        Team team = new Team("Team Moniki");
        League league = new League("LeagueOfLegends");
        league.addTeamtoLeague(team);

    }
}
