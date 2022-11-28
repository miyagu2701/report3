package jp.ac.uryukyu.ie.e225753;

public class Warrior extends LivingThing {
    public Warrior(String name,int maximumHP,int attack){
        super(name, maximumHP, attack);
    }
    public void attackWithWeponSkill(LivingThing s){
        if (this.dead == false) {
            int damage = (int) (getAttack() * 1.5);
            System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！\n", name, s.getName(), damage);
            s.wounded(damage);
        }
    }
}
