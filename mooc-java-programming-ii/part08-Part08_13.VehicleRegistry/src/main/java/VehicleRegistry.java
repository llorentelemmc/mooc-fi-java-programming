import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class VehicleRegistry {

    private final HashMap<LicensePlate, String> platesAndOwners = new HashMap<>();

    public boolean add(LicensePlate licensePlate, String owner) {
        if (platesAndOwners.get(licensePlate) == null) {
            platesAndOwners.put(licensePlate, owner);
            return true;
        }
        return false;
    }

    public String get(LicensePlate licensePlate) {
        return platesAndOwners.get(licensePlate);
    }

    public boolean remove(LicensePlate licensePlate) {
        if (platesAndOwners.containsKey(licensePlate)) {
            platesAndOwners.remove(licensePlate);
            return true;
        }
        return false;
    }

    public void printLicensePlates() {
        for (LicensePlate licensePlate : platesAndOwners.keySet()) {
            System.out.println(licensePlate);
        }
    }

    public void printOwners() {
        Set<String> owners = new HashSet<>(platesAndOwners.values());
        for (String owner : owners) {
            System.out.println(owner);
        }
    }


}

