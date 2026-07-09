import java.util.ArrayList;
import java.util.List;

public class ExplosionExperiment {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Ana");
        names.add("Bruno");
        names.add("Carla");

        names.removeIf(name -> name.startsWith("B"));

        System.out.println(names);
    }
}