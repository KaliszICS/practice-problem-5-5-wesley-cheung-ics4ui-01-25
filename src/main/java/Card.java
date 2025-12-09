class Card implements Comparable<Card> {

    private String name;
    private String suit;

    public Card (String name, String suit) {
        this.name = name;
        this.suit = suit;
    }


    public String getName() {
        return this.name;
    }

    public String getSuit() {
        return this.suit;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    @Override
    public String toString() {
        return this.name + " of " + this.suit;
    }

    final String[] names = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
    final String[] suits = {"Hearts","Clubs","Diamonds","Spades"};
    @Override
    public int compareTo(Card card) {
        if (this.name == card.getName()) {
            if (this.suit == card.getSuit()) {
                return 0;
            } else {
                int first = 0;
                int second = 0;
                for (int i = 0;i<this.suits.length;i++) {
                    if (card.getSuit() == suits[i]) {
                        first = i;
                    } else if (this.suit == suits[i]) {
                        second = i;
                    }
                }
                if (second > first) {
                    return 1;
                } else return -1;
            }
        }
        int first = 0;
        int second = 0;
        for (int i = 0;i<this.names.length;i++) {
            if (card.getName() == this.names[i]) {
                first = i;
            } else if (this.name == this.names[i]) {
                second = i;
            }
        }
        if (second > first) {
            return 1;
        } else return -1;
    }
}
