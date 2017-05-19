package SchoolJson;

import java.util.Formatter;
import java.util.HashMap;

/**
 * Created by bllli on 17-5-19.
 */
public class Department implements NameAndCode{
    private Specialty[] specialties;
    private String code;
    private String name;

    public String getName(){return name;}
    public String getCode(){return code;}

    public HashMap<String, Specialty> getSpecialtiesHashMap(){
        HashMap<String, Specialty> specialtiesHashMap = new HashMap<>();
        for( Specialty s:specialties){
            specialtiesHashMap.put(s.getName(), s);
        }
        return specialtiesHashMap;
    }

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
