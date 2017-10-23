package jv17_05.pavliuk.lesson13.clothes;

public enum Size {
    XXS(34) {
        public String getDescription() {
            return "Детский размер";
        }
    },
    XS(36), S(38), M(40), L(42);

    private int euroSize;

    public int getEuroSize() {
        return euroSize;
    }

    Size(int euroSize) {
        this.euroSize = euroSize;
    }

    public String getDescription() {
        return "Взрослый размер";
    }
}