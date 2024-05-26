package week4.day24;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class NameChangeListener implements PropertyChangeListener {
    @Override
    public void propertyChange(PropertyChangeEvent event) {
        System.out.println("Name changed from " + event.getOldValue() + " to " + event.getNewValue());
    }
}
