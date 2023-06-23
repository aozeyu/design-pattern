package org.example.mediator;

public class Client {
    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();
        ConcreteColleague1 concreteColleague1 = new ConcreteColleague1("colleague1", mediator);
        ConcreteColleague2 concreteColleague2 = new ConcreteColleague2("colleague2", mediator);

        mediator.setColleague1(concreteColleague1);
        mediator.setColleague2(concreteColleague2);

        concreteColleague1.send("同事2好，我是同事1");
        concreteColleague2.send("同事1好，我是同事2");

    }
}
