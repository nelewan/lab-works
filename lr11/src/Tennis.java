class Tennis extends Sport {

    private String courtType;

    public Tennis(String name, int players, int duration, String courtType) {
        super(name, players, duration);
        this.courtType = courtType;
    }

    @Override
    public String getRules() {
        return "1 или 2 игрока";
    }

    public void play(String opponent, boolean isMatchPoint) {
        System.out.println("Матч на корте (" + courtType + ") против " + opponent +
                (isMatchPoint ? " [Матчбол!]" : ""));
    }
}