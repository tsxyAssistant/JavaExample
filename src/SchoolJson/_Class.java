package SchoolJson;

import java.text.Format;
import java.util.Formatter;

/**
 * Created by bllli on 17-5-19.
 */
public class _Class implements NameAndCode{
    private String code;
    private String name;

    public String getName(){return name;}
    public String getCode(){return code;}

    public String toString(){
        StringBuilder sb = new StringBuilder();
        Formatter fmt = new Formatter(sb);
        fmt.format("[%s]%s %s", getClass(), code, name);
        return sb.toString();
    }
}
