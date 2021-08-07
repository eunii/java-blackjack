package blackjack.domain;

public class Player extends Human {
    public int getBettingMoney() {
        return bettingMoney;
    }

    private final int bettingMoney;

    public Player(String name) {
        super(name);
        bettingMoney = 0;
    }
    public Player(String name, int bettingMoney) {
        super(name);
        this.bettingMoney = bettingMoney;
    }

}
