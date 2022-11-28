package jp.ac.uryukyu.ie.e225753;

public class LivingThing {
    String name;
    int hitPoint;
    int attack;
    boolean dead;

    public void setLivingThing(String neam, int hitPoint, int attack, boolean dead) {
        this.name = name;
        this.hitPoint = hitPoint;
        this.attack = attack;
        this.dead = dead;
    }

    public LivingThing(String name, int maximumHP, int attack) {
        this.name = name;
        hitPoint = maximumHP;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }

    public boolean isDead() {
        return this.dead;
    }

    public String getName() {
        return this.name;
    }

    public int getHitPoint() {
        return this.hitPoint;
    }

    public int getAttack() {
        return this.attack;
    }

    public boolean getDead() {
        return this.dead;
    }


    public void attack(LivingThing s) {
        if (this.dead == false) {
            int damage = (int) (Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, s.getName(), damage);
            s.wounded(damage);
        }
    }

    public void wounded(int damage) {
        hitPoint -= damage;
        if (hitPoint < 0) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }
}
