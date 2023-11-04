package jpu2016.dogfightt.controller;

public class UserOrder implements IUserOrder {
    private int player;
    private Order order;

    public UserOrder(int player, Order order) {
        this.player = player;
        this.order = order;
    }

    @Override
    public Order getOrder() {
        return order;
    }

    @Override
    public int getPlayer() {
        return player;
    }
}