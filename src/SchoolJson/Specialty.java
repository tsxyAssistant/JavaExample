package SchoolJson;

import java.util.Formatter;

/**
 * Created by bllli on 17-5-19.
 */
public class Specialty {

    private _Class[] classes;
    private String code;
    private String name;

    public String toString(){
        StringBuilder sb = new StringBuilder();
        Formatter fmt = new Formatter(sb);
        fmt.format("[%s]%s %s", getClass(), code, name);
        for (_Class c:classes) {
            sb.append("\n  ");
            sb.append(c.toString());
        }
        return sb.toString();
    }
}
