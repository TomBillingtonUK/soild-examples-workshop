package interfaceSegregation;

public interface CarPark {

    void parkCar();
    void unparkCar();
    void getCapacity();
    double calculateFee(Car car);
    void makePayment(Car car);
}
