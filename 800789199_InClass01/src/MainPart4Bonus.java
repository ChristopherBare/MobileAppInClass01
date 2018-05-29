import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/*
In Class Assinment 1
MainPart1.java
Christopher Bare
800789199
 */
public class MainPart4Bonus {
    /*
    * Question 4:
    * - In this question you will use the Data.users and Data.otherUsers array that includes
    * a list of users. Formatted as : firstname,lastname,age,email,gender,city,state
    * - Create a User class that should parse all the parameters for each user.
    * - The goal is to print out the users that are exist in both the Data.users and Data.otherUsers.
    * Two users are equal if all their attributes are equal.
    * - Print out the list of users which exist in both Data.users and Data.otherUsers.
    * */

    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<User>();
        ArrayList<User> otherUsers = new ArrayList<User>();

        for (String str : Data.users) {
            List<String> strings = Arrays.asList(str.split("\\s*,\\s*"));
            users.add(getUser(strings));
        }

        for (String str : Data.otherUsers) {
            List<String> strings = Arrays.asList(str.split("\\s*,\\s*"));
            otherUsers.add(getUser(strings));
        }

        for (User u : users)
            for (User u2 : otherUsers)
                if (u.getFirst().equals(u2.getFirst())
                        && u.getLast().equals(u2.getLast())
                        && u.getAge() == u2.getAge()
                        && u.getEmail().equals(u2.getEmail())
                        && u.getGender().equals(u2.getGender())
                        && u.getCity().equals(u2.getCity())
                        && u.getState().equals(u2.getState())) {
                    System.out.println(u.getFirst() + " " + u.getLast());
                }
    }







    public static User getUser(List<String> strings) {
        User user;
        user = new User();
        user.setFirst(strings.get(0));
        user.setLast(strings.get(1));
        user.setAge(Integer.parseInt(strings.get(2)));
        user.setEmail(strings.get(3));
        user.setGender(strings.get(4));
        user.setCity(strings.get(5));
        user.setState(strings.get(6));
        return user;
    }
}