package cc.chengheng.行为型.F中介者模式;

public class CoffeeMachine extends AbstractColleague {

    public CoffeeMachine(AbstractMediator mediator, String name) {
        super(mediator, name);
        mediator.register(name, this);
    }


    @Override
    public void sendMessage(int stateChange) {
        getMediator().getMessage(stateChange, name);
    }


    public void startCoffee() {
        System.out.println("It's time to startcoffee!");
    }


    public void finishCoffee() {
        System.out.println("After 5 minutes!");
        System.out.println("Coffee is ok!");
        sendMessage(0);
    }
}

