package day7;

public class SportsCar extends Car{
    public Integer speed;
    public Integer noOfSeat;

    public Integer getSpeed(){
        return 100;
    }

    //override
    public Integer getNoOfWheels(){
        return 6;
    }
}
