package examples.users;

import com.intuit.karate.junit5.Karate;

class Userrunner {

    @Karate.Test
    Karate testUsers() {
        return Karate.run("users").relativeTo(getClass());
    }

}