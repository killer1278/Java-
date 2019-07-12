package com.java.ch10.greedySnake;

import java.util.Scanner;

/**
 * 显示蛇的面板
 * 包含一条蛇
 */
public class WormPanel {
    private Worm worm;
    private int rows;
    private int cols;
    public WormPanel(int rows,int cols){
        this.rows = rows;
        this.cols = cols;
        worm = new Worm();
    }
    /**
     * 显示面板内容
     */
    public void print(){
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(i==0 || i==rows-1){
                    System.out.print("-");
                } else if(j==0 || j==cols-1){
                    System.out.print("|");
                } else if(worm.contains(i,j)){
                    if(worm.isHead(i,j)){
                        System.out.print("*");
                    } else {
                        System.out.print("#");
                    }
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    /**
     * 获取面板上的蛇
     * @return 蛇对象
     */
    public Worm getWorm(){
        return worm;
    }
}
