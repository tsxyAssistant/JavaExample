package SchoolJson;

import java.util.Formatter;

/**
 * Created by bllli on 17-5-19.
 */
public class Department {
    private Specialty[] specialties;
    private String code;
    private String name;

    public String toString(){
        StringBuilder sb = new StringBuilder();
        Formatter fmt = new Formatter(sb);
        fmt.format("[%s]%s %s", getClass(), code, name);
        for (Specialty s:specialties) {
            sb.append("\n  ");
            sb.append(s.toString());
        }
        return sb.toString();
    }
}
