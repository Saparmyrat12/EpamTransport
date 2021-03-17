import model.dao.jdbc.JdbcStopDao;
import model.entities.Stop;
import model.services.service.StopService;
import java.lang.reflect.InvocationTargetException;
import java.sql.*;
import java.util.List;


public class Test {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SQLException, IllegalAccessException, InvocationTargetException, InstantiationException{
        Driver driver = (Driver) Class.forName("com.mysql.cj.jdbc.Driver").getConstructor().newInstance();
        DriverManager.registerDriver(driver);
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/transport_db", "root", "sapar12");
        JdbcStopDao stopsDao = new JdbcStopDao();
        stopsDao.setConnection(c);

        List<Stop> stops = stopsDao.findAll();
        for (Stop user : stops) {
            System.out.println(user);
        }
        System.out.println("OK findAll()");
    }
}
