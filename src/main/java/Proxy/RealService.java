package Proxy;

public class RealService implements Service {
    @Override
    public void doSomething() {
        System.out.println("DO SOMETHING");
    }
}
