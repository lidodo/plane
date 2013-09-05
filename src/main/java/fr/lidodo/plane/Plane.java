package fr.lidodo.plane;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Plane {

    private String name;
    private int initialHeight;
    private List<Integer> flightSequence;
    private int flightTime;
    private int maxHeight;

    public Plane(String name) {
        this(CharLenghtUtil.compute(name));
        this.name = name;
    }

    public Plane(int initialNumber) {
        super();
        this.name = String.valueOf(initialNumber);
        this.initialHeight = initialNumber;
        this.flightSequence = SyracuseUtil.compute(new ArrayList<Integer>(), initialNumber);
        this.flightTime = computeFlightTime(new ArrayList<Integer>(this.flightSequence), 0);
        this.maxHeight = Collections.max(this.flightSequence);
    }

    public int getInitialNumber() {
        return initialHeight;
    }

    public List<Integer> getFlightSequence() {
        return this.flightSequence;
    }

    public int getTotalFlightTime() {
        return getFlightSequence().size();
    }

    public int getFlightTime() {
        return flightTime;
    }

    public int getMaxHeight() {
        return this.maxHeight;
    }

    @Override
    public String toString() {
        return "Plane" +
                " [name=" + this.name +
                ", initialHeight=" + this.initialHeight +
                ", flightSequence=" + this.flightSequence +
                ", totalFlightTime=" + this.getTotalFlightTime() +
                ", flightTime=" + this.flightTime +
                ", maxHeight=" + this.maxHeight +
                "]";
    }

    private int computeFlightTime(List<Integer> list, int time) {
        if (list != null && !list.isEmpty() && list.get(0) >= this.initialHeight) {
            time += 1;
            list.remove(0);
            return computeFlightTime(list, time);
        }
        return time;
    }


}
