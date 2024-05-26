package week4.day22.observer;

class ForecastDisplay implements Observer {
    private float temperature;

    @Override
    public void update(float temperature) {
        this.temperature = temperature;
        display();
    }

    public void display() {
        System.out.println("Forecast Display: " + (temperature + 0.5f));
    }
}