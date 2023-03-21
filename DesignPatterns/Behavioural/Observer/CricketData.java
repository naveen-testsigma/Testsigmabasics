package DesignPatterns.Behavioural.Observer;

import java.util.ArrayList;
import java.util.Iterator;

public class CricketData implements Subject {
    int runs;
    int wickets;
    float overs;
    ArrayList<Observer> observerList;

    public CricketData() {
        observerList = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        observerList.add(o);
    }

    @Override
    public void unregisterObserver (Observer o) {
        observerList.remove(observerList.indexOf(o));
    }

    @Override
    public void notifyObservers() {
        for (Observer o:observerList ) {

            o.update(runs, wickets, overs);
        }
    }

    private int getLatestRuns() {
        return 100;
    }
    private int getLatestWickets() {
        return 3;
    }
    private float getLatestOvers() {
        return (float) 10.2;
    }
    public void dataChanged() {
        //get latest data
        runs = getLatestRuns();
        wickets = getLatestWickets();
        overs = getLatestOvers();

        notifyObservers();
    }
}
