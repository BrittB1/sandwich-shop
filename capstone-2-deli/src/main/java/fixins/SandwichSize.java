package fixins;

public enum SandwichSize {

    SMALL("4-inch for when you're just a little hungry", 4),
    MEDIUM("8-inch that's great to share, if you want to", 8),
    LARGE("12-inch for those times when you're so hungry you could eat a horse", 12);

    /* describes size, shows the user what they'll be getting */


    private String description;
    private int inches;

    SandwichSize(String description, int inches) {
        this.description = description;
        this.inches = inches;

    }

    public String getDescription() {
        return description;
    }

    public int getInches() {
        return inches;
    }
    }
