package Test_Practico_14.DataSet;
import com.github.javafaker.Faker;
import java.util.Locale;
import java.util.Random;

public class DataFactoryRegistrationSalesForce {

    public Faker faker = new Faker(new Locale("YOUR_LOCALE"));
    public String getFirstName() {
        String firstName = faker.name().firstName();
        return firstName;
    }

    public String getLastName() {
        String lastName = faker.name().lastName();
        return lastName;
    }

    public String getTitle() {
        String title = faker.job().title();
        return title;
    }

    public CharSequence getPhone() {
        Random random = new Random();
        return String.valueOf(random.nextInt(10000000) + 1000000000);
    }

    public String getEmail() {
        String email = faker.internet().emailAddress();
        return email;
    }

    public String getCompanyName() {
        String companyName = faker.company().name();
        return companyName;
    }




}

