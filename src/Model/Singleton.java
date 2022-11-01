package Model;

/**
 *
 * @author kevin
 */
public class Singleton {

    private static Singleton instance;
    private DataKTP data;

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public DataKTP getData() {
        return data;
    }

    public void setData(DataKTP data) {
        this.data = data;
    }
}
