package com.java.ch10.greedySnake;

import java.util.Scanner;

/**
 * 测试蛇在面板上走
 */
public class PlayDemo {
    public static void main(String[] args){
        WormPanel pane = new WormPanel(15,45);
        Scanner console = new Scanner(System.in);
        Worm worm = pane.getWorm();
        for(;;){
            pane.print();
            String cmd = console.nextLine();
            switch (cmd){
                case "w":
                    worm.step(Worm.UP);
                    break;
                case "s":
                    worm.step(Worm.DOWN);
                    break;
                case "a":
                    worm.step(Worm.LEFT);
                    break;
                case "d":
                    worm.step(Worm.RIGHT);
                    break;
                case "q":
                    System.out.println("退出成功");
                    break;
                default:
                    worm.step();
            }
        }
    }
}
