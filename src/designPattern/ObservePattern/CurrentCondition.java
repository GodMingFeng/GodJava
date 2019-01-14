package designPattern.ObservePattern;

public class CurrentCondition implements Display, Observer {
    private float template;
    private Subject subject;

    public CurrentCondition(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void display(float template) {
        System.out.println(template);
    }

    @Override
    public void update(float template) {
        this.template = template;
        System.out.println(this + "change!" + template);
    }
}
