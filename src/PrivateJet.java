/**
 * Класс для представления частного самолета.
 */
public class PrivateJet extends Aircraft {
    public PrivateJet(int passengerCount, double fuelAmount, String flightName) {
        super(passengerCount, fuelAmount, flightName);
    }

    @Override
    public double calculateFuelConsumption() {
        return fuelAmount / passengerCount; // Пример расчета расхода топлива
    }
}