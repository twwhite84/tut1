import java.util.Locale;
import java.util.ResourceBundle;

public class Greeter {

  private Locale locale;
  private String name;

  public Greeter(String language, String country, String name) {
    locale = new Locale(language, country);
    this.name = name;
  }

  public String sayHello() {
    ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", locale);
    return messages.getString("Greeting") + ", " + name.toUpperCase();
    //deleted markers and chose to keep .toUpperCase() version
  }

  public static void main(String[] args) {
    try {
    String language = args[0];
    String country = args[1];
    String name = args[2];
    Greeter greeter = new Greeter(language, country, name);
    System.out.println(greeter.sayHello());
    } catch(Exception ex) {
      System.out.println("Something went wrong. Please check your arguments.");
    }
  }
}
