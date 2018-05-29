import java.util.*;

/*
In Class Assinment 1
MainPart2.java
Christopher Bare
800789199
 */
public class MainPart2 {
    /*
     * Question 2:
     * - In this question you will use the Data.users array that includes
     * a list of users. Formatted as : firstname,lastname,age,email,gender,city,state
     * - Create a User class that should parse all the parameters for each user.
     * - The goal is to count the number of users living each state.
     * - Print out the list of State, Count order in ascending order by count.
     * */

    public static void main(String[] args) {
        HashMap<String, Integer> pop = new HashMap<>();

        //example on how to access the Data.users array.
        for (String str : Data.users) {
            List<String> strings = Arrays.asList(str.split("\\s*,\\s*"));
            String state = strings.get(6);

            if(!pop.containsKey(state))
                pop.put(state, 1);
            else {
                int population = pop .get(state);
                pop.replace(state, population + 1);
            }
        }

        HashMap<String, Integer> newMap = sortHashMapByValues(pop);
        for (Map.Entry<String, Integer> entry : newMap.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println(key + ", Population: " + value);
        }
    }


    public static LinkedHashMap<String, Integer> sortHashMapByValues(
        HashMap<String, Integer> passedMap) {
        List<String> mapKeys = new ArrayList<>(passedMap.keySet());
        List<Integer> mapValues = new ArrayList<>(passedMap.values());
        Collections.sort(mapValues);
        Collections.sort(mapKeys);

        LinkedHashMap<String, Integer> sortedMap =
                new LinkedHashMap<>();

        Iterator<Integer> valueIt = mapValues.iterator();
        while (valueIt.hasNext()) {
            Integer val = valueIt.next();
            Iterator<String> keyIt = mapKeys.iterator();

            while (keyIt.hasNext()) {
                String key = keyIt.next();
                Integer comp1 = passedMap.get(key);
                Integer comp2 = val;

                if (comp1.equals(comp2)) {
                    keyIt.remove();
                    sortedMap.put(key, val);
                    break;
                }
            }
        }
        return sortedMap;
    }
}