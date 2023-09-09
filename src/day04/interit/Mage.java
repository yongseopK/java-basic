package day04.interit;

public class Mage extends Player {

    private int mana;

    public Mage(String nickName) {
        super(nickName);
        this.mana = 100;
    }

    @Override
    public void status() {
        super.status();
        System.out.println("# 마나 : " + mana);
    }

    public void blizzard() {
        System.out.println("눈보라를 시전합니다.");
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }
}






