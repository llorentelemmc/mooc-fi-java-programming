import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {

    private HashMap<String, ArrayList<String>> facility;

    public StorageFacility() {
        this.facility = new HashMap<>();
    }
    public void add(String unit, String item) {
        // an empty list has to be added for a new word if one has not already been added
        facility.putIfAbsent(unit, new ArrayList<>());
        facility.get(unit).add(item);
    }
    public ArrayList<String> contents(String unit) {
        return facility.getOrDefault(unit, new ArrayList<>());
    }
    public void remove(String unit, String item) {
        facility.get(unit).remove(item);
        if (facility.get(unit).isEmpty()) {
            facility.remove(unit);
        }
    }
    public ArrayList<String> storageUnits() {
        final ArrayList<String> unitNames = new ArrayList<>();
        facility.forEach((key, value) -> {
            if (!value.isEmpty()) {
                unitNames.add(key);
            }
        });
        return unitNames;
    }
}
