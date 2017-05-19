package SchoolJson;

import java.util.Formatter;
import java.util.HashMap;

/**
 * Created by bllli on 17-5-19.
 */
public class Specialty implements NameAndCode{

    private _Class[] classes;
    private String code;
    private String name;

    public String getName(){return name;}
    public String getCode(){return code;}

    public HashMap<String, _Class> getClassesHashMap(){
        HashMap<String, _Class> classesHashMap = new HashMap<>();
        for(_Class c:classes){
            classesHashMap.put(c.getName(), c);
        }
        return classesHashMap;
    }

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
