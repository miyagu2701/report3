package jp.ac.uryukyu.ie.e225753;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WarriorTest {
    @Test
    void attackWithWeponSkillTest() {
        int enemylife = 10;
        Warrior demowarrior = new Warrior("デモ戦士", 100, 100);

        for (int count = 0; count < 4; count++) {
            Enemy slime = new Enemy("スライムもどき", 160, 100);
            demowarrior.attackWithWeponSkill(slime);
            assertEquals(enemylife, slime.getHitPoint());
        }

    }
}
