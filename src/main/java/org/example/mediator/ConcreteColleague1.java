package org.example.mediator;

public class ConcreteColleague1 extends Colleage{
    public ConcreteColleague1(String name, Mediator mediator) {
        super(name, mediator);
    }

    @Override
    public void send(String message) {
        this.getMediator().send(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.println("同事:" + getName() + "收到了消息:" + message);
    }
}
