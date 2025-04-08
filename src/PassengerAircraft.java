/**
 * Класс для представления пассажирского самолета.
 */
public class PassengerAircraft extends Aircraft {
    public PassengerAircraft(int passengerCount, double fuelAmount, String flightName) {
        super(passengerCount, fuelAmount, flightName);
    }

    @Override
    public double calculateFuelConsumption() {
        return fuelAmount / passengerCount; // Пример расчета расхода топлива
    }
}
