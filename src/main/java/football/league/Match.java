package football.league;

public class Match {

    private Team host;
    private Team away;
    private int hostScore;
    private int awayScore;
    private static League league;

    public Match(Team host, Team away, int hostScore, int awayScore) {
        this.host = host;
        this.away = away;
        this.hostScore = hostScore;
        this.awayScore = awayScore;
        handleScores(hostScore, awayScore, host, away);
    }

    public Team getHost() {
        return host;
    }

    public Team getAway() {
        return away;
    }

    public String getResult() {
        return String.valueOf(hostScore + " : " + awayScore);
    }

    public void handleScores(int hostScore, int awayScore, Team host, Team away) {
        if (hostScore == awayScore) {
            league.addPointToTeam(host, 1);
            league.addPointToTeam(away, 1);
        }
        else if(hostScore > awayScore) {
            league.addPointToTeam(host, 3);
        }
        else {
            league.addPointToTeam(away, 3);
        }

    }
}
