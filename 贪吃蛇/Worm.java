package com.java.ch10.greedySnake;
/**
 * 蛇包含一堆节点
 */

import java.util.LinkedList;

public class Worm {
    public static final int UP = -10;
    public static final int DOWN = 10;
    public static final int LEFT = -1;
    public static final int RIGHT= 1;

    private LinkedList<Node> nodes = new LinkedList<Node>();
    private int dir;

    public Worm(){
        nodes.add(new Node(3,9));
        nodes.add(new Node(4,9));
        nodes.add(new Node(5,9));
        nodes.add(new Node(5,10));
        nodes.add(new Node(5,11));
        nodes.add(new Node(6,11));
        nodes.add(new Node(7,11));
        dir = RIGHT;
    }
    /**
     * 沿着当前方向走一步
     */
    public void step(){
        Node head = nodes.getFirst();
        int i = head.getI() + dir/10;
        int j = head.getJ() + dir%10;
        head = new Node(i,j);
        nodes.addFirst(head);
        nodes.removeLast();
    }
    /**
     * 换方向走一步
     * @param dir 新方向
     */
    public void step(int dir){
        if(this.dir + dir == 0){
            throw new RuntimeException("亲，不能走反向");
        }
        this.dir = dir;
        step();
    }
    public boolean contains(int i,int j){
        return nodes.contains(new Node(i,j));
    }
    public String toString(){
        return nodes.toString();
    }

    /**
     * 贪吃蛇的头用*打印
     * @return int i, int j
     */
    public boolean isHead(int i,int j){
        Node head = nodes.getFirst();
        if(head.equals(new Node(i,j))){
            return true;
        }
        return false;
    }
}
