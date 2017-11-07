package jv17_05.pavliuk.lesson12.seasons;

public enum Seasons {
    WINTER(-10),
    SPRING(5),
    SUMMER(24) {
        public String getDescription() {
            return "is hot season";
        }
    },
    AUTUMN(4);
    public int averageTemp;

    Seasons(int averageTemp) {
        this.averageTemp = averageTemp;
    }

    public String getDescription() {
        return "is cold season";
    }
}
