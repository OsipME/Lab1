/**
 * Класс для представления грузового самолета.
 */
public class CargoAircraft extends Aircraft {
    public CargoAircraft(int passengerCount, double fuelAmount, String flightName) {
        super(passengerCount, fuelAmount, flightName);
    }

    @Override
    public double calculateFuelConsumption() {
        return fuelAmount / passengerCount; // Пример расчета расхода топлива
    }
}
