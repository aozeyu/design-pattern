package org.example.mediator;

public abstract class Colleage {
    //名字
    private String name;
    //中介者
    private Mediator mediator;

    public Colleage(String name, Mediator mediator) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void send(String message);

    public abstract void receive(String message);

}
