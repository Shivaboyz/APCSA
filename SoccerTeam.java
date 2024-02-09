public class SoccerTeam {
    private int wins;
    private int losses;
    private int ties;

    public SoccerTeam(int w, int l, int t) {
        wins = w;
        losses = l;
        ties = t;
    }

    public void played(SoccerTeam other, int myScore, int otherScore) {
        if (myScore>otherScore) {
            this.wins += 1;
            other.losses += 1;
        }
        else if (myScore<otherScore) {
            this.losses += 1;
            other.wins += 1;
        }
        else if (myScore == otherScore) {
            this.ties += 1;
            other.ties += 1;
        }
    }

    public int getTeamPoints() {
        int fin = 0;
        fin += this.ties;
        fin += 3*(this.wins);
        return fin;
    }

    
    
}
