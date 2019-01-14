package designPattern.ObservePattern;

import java.util.ArrayList;

//观察者模式 Subject改变 通知Observer
public class WeatherData implements Subject {
    private float template;
    private ArrayList<Observer> list = new ArrayList<>();

    @Override
    public void registerObserver(Observer o) {
        list.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int index = list.indexOf(o);
        if (index != -1) {
            list.remove(index);
        }
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : list) {
            observer.update(template);
        }
    }

    public void setTemplate(float template) {
        this.template = template;
        this.change();
    }

    public void change() {
        notifyObserver();
    }
}
