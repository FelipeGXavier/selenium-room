package ifc;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> {
            try {
                new SeleniumExecutor().run(new Credentials("a@a.com", "123"));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        new SeleniumExecutor().run(new Credentials("b@b.com", "123"));
    }

    public static class Credentials {

        private final String user;
        private final String password;

        public Credentials(String user, String password) {
            this.user = user;
            this.password = password;
        }

        public String getUser() {
            return user;
        }

        public String getPassword() {
            return password;
        }
    }
}
