package AppLab4;

import java.util.HashMap;
import java.util.Map;

public class AppLab4 {
    public static void main(String[] args) {
        HashMap<String, Integer> varste = new HashMap<>();
        varste.put("Ioan", 21);
        varste.put("Maria", 22);
        varste.put("Victor", 20);
        varste.put("Simina", 20);
        varste.put("Marius", 21);
        varste.put("Mihai", 21);
        varste.put("Daniela", 23);

        Map<String, String> adrese = Map.of("Ioan", "Sibiu", "Maria", "Bucuresti", "Victor",
                "Cluj","Simina", "Alba-Iulia","Marius", "Medias", "Mihai", "Cisnadie","Daniela", "Sibiu");

        for (String nume : varste.keySet()){
            System.out.println(nume + " - " + varste.get(nume));
        }
        System.out.println("------------------------------------");
        varste.put("Vlad", 19);
        varste.put("Iulia", 19);
        for (String nume : varste.keySet()){
            System.out.println(nume + " - " + varste.get(nume));
        }
        System.out.println("------------------------------------");
        HashMap<String, Tanar> tineriMap = new HashMap<>();
        for (String nume : varste.keySet()){
            tineriMap.put(nume, new Tanar(nume, varste.get(nume), adrese.get(nume)));
        }
        for (String nume : tineriMap.keySet()){
            System.out.println(tineriMap.get(nume));
        }
    }
}
