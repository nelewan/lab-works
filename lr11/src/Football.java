class Football extends Sport {

    private String tournament;

    public Football(String name, int duration, String tournament) {
        super(name, 11, duration);
        this.tournament = tournament;
    }

    @Override
    public String getRules() {
        return "11 игроков, 2 тайма";
    }

    public void play(String team, int scoredGoals) {
        System.out.println("Играю за команду " + team + " в турнире " + tournament + ", забито голов: " + scoredGoals);
    }
}