public class Main {
    public static void main(String[] args) {

        User luca = new User("Luca", "luca@swed.de");

        Website website1 = new Website("https://github.com/");
        Website website2 = new Website("https://wttr.in/");

        Systems system = new Systems();

        system.addUser(luca);

        system.subscribe(luca, website1);
        system.subscribe(luca, website2);

        // endless loop for update checks
        // Improve: User Input for frequency
        while (true) {
            system.checkUpdate();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Error occured");
            }
        }
    }
}




/*
Coding Conventions:
Camel Case
Invert if Refactoring

Improve:
not using nested loops
DRY
 */