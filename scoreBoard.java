public class Scoreboard {
    private String team1Name;
    private String team2Name;
    private int team1Score;
    private int team2Score;
    private boolean isTeam1Active;


    public Scoreboard(String team1, String team2) {
        team1Name = team1;
        team2Name = team2;
        team1Score = 0;
        team2Score = 0;
        isTeam1Active = true;  // Game always begins with team 1 as the active team
    }

    public void recordPlay(int points) {
        if (points > 0) {
            if (isTeam1Active) {
                team1Score += points;
            } else {
                team2Score += points;
            }
        } else {
            // If points is 0, switch the active team
            isTeam1Active = !isTeam1Active;
        }
    }

    /**
     * Gets the current score and state of the game.
     * @return A string containing the scores and the name of the active team
     */
    public String getScore() {
        String activeTeam = isTeam1Active ? team1Name : team2Name;
        return team1Score + "-" + team2Score + "-" + activeTeam;
    }
}