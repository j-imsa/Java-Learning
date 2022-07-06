import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.SQLException;
import java.util.Properties;

public class JdbcCustomDriverLoader {
    public static void main(String[] args) throws MalformedURLException, ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {

        // Step 1: load jar files from file (or anywhere like URL)
        File jarFileDriver1 = new File("/path/to/driver1.jar"); // oracle8
        File jarFileDriver2 = new File("/path/to/driver2.jar"); // MySQL
        // ...
        File jarFileDriverN = new File("/path/to/driverN.jar"); // JDBC driver

        URL[] cp = new URL[N];
        cp[0] = jarFileDriver1.toURI().toURL();
        cp[1] = jarFileDriver2.toURI().toURL();
        // ...
        cp[N-1] = jarFileDriverN.toURI().toURL();

        // Step 2: CustomClassLoader
        URLClassLoader customLoader = new URLClassLoader(cp, ClassLoader.getSystemClassLoader());

        // Step 3: Loading the class then creating a driver object
        Class driverClass = customLoader.loadClass("oracle.jdbc.driver.OracleDriver"); // Driver Path
        Driver driver = (Driver) driverClass.newInstance();

        // Step 4: Utilise driver
        Properties props = new Properties();
        props.setProperty("username", "XXXXXXXXXXXX");
        props.setProperty("password", "XXXXXXXXXXXX");
        Connection conn = driver.connect("jdbc:oracle:thin:@some-oracle-8-server:port:sid",props);

    }
}