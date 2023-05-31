package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    Game game = new Game();

    Player player1 = new Player(1, "Tomas", 10);
    Player player2 = new Player(2, "Nikolas", 15);
    Player player3 = new Player(3, "Bred", 20);
    Player player4 = new Player(4, "Jess", 30);
    Player player5 = new Player(5, "Lera", 10);


    @BeforeEach
    public void setup() {
        game.register(player1);
        game.register(player2);
        game.register(player3);
        game.register(player4);
        game.register(player5);
    }

    @Test
    public void test1() {
        int actual = game.round("Bred", "Lera");
        Assertions.assertEquals(1, actual);
    }

    @Test
    public void test2() {
        int actual = game.round("Nikolas", "Jess");
        Assertions.assertEquals(2,actual);
    }

    @Test
    public void test3() {
        int actual = game.round("Lera", "Tomas");
        Assertions.assertEquals(0, actual);
    }

    @Test
    public void test4() {
        Assertions.assertThrows(NotRegisteredException.class, () ->{
            game.round("Marina","Jess");
        });
    }

    @Test
    public void test5() {
        Assertions.assertThrows(NotRegisteredException.class, () ->{
            game.round("Jess","Marina");
        });
    }

}