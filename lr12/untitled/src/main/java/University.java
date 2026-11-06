import java.util.List;

class University {
    int id;
    String name;
    String country;
    int rank;
    List<Integer> studentRatings;

    public University(int id, String name, String country, int rank, List<Integer> studentRatings) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.rank = rank;
        this.studentRatings = studentRatings;
    }

    public double getAverageRating() {
        double sum = 0;
        for (int r : studentRatings) {
            sum += r;
        }
        return sum / studentRatings.size();
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
}
