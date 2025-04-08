/**
 * Абстрактный класс для представления самолета.
 */
public abstract class Aircraft {
    protected int passengerCount; // Количество пассажиров
    protected double fuelAmount;   // Количество топлива
    protected String flightName;   // Название рейса

    public Aircraft(int passengerCount, double fuelAmount, String flightName) {
        this.passengerCount = passengerCount;
        this.fuelAmount = fuelAmount;
        this.flightName = flightName;
    }

    public abstract double calculateFuelConsumption(); // Метод для расчета расхода топлива

    public int getPassengerCount() {
        return passengerCount;
    }

    public String getFlightName() {
        return flightName;
    }
}
