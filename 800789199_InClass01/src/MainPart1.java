import java.util.*;

public class MainPart1 {
    /*
     * Question 1:
     * - In this question you will use the Data.users array that includes
     * a list of users. Formatted as : firstname,lastname,age,email,gender,city,state
     * - Create a User class that should parse all the parameters for each user.
     * - Insert each of the users in a list.
     * - Print out the TOP 10 oldest users.
     * */
    /*
    In Class Assinment 1
    MainPart1.java
    Christopher Bare
    800789199
     */

    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<User>();
        User user;


        //example on how to access the Data.users array.
        for (String str : Data.users) {
            List<String> strings = Arrays.asList(str.split("\\s*,\\s*"));
            user = new User();
            user.setFirst(strings.get(0));
            user.setLast(strings.get(1));
            user.setAge(Integer.parseInt(strings.get(2)));
            user.setEmail(strings.get(3));
            user.setGender(strings.get(4));
            user.setCity(strings.get(5));
            user.setState(strings.get(6));
            users.add(user);
        }

        users.sort(Comparator.comparing(User::getAge));
        Collections.reverse(users);
        for (int i = 0; i < 10; i++) {
            System.out.println(users.get(i).getFirst() + " " + users.get(i).getLast() + ", Age: " + users.get(i).getAge());
        }
    }
}

