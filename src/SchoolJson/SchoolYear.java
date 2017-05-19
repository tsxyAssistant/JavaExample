package SchoolJson;

import java.util.Formatter;
import java.util.HashMap;

/**
 * Created by bllli on 17-5-19.
 */
public class SchoolYear {
    private Department[] departments;
    private String year;

    public String getYear(){
        return year;
    }

    public HashMap<String, Department> getDepartmentsHashMap(){
        HashMap<String, Department> departmentHashMap = new HashMap<>();
        for( Department d:departments ){
            departmentHashMap.put(d.getName(), d);
        }
        return departmentHashMap;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        Formatter fmt = new Formatter(sb);
        fmt.format("[%s]%s", getClass(), year);
        for (Department d:departments) {
            sb.append("\n  ");
            sb.append(d.toString());
        }
        return sb.toString();
    }
}
