package SchoolJson;

import com.google.gson.annotations.SerializedName;

import java.time.*;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.HashMap;
import java.util.List;

/**
 * Created by bllli on 17-5-19.
 */
public class School {
    @SerializedName(value = "school_years")
    private List<SchoolYear> schoolYears;

    public HashMap<String, SchoolYear> getSchoolYearsHashMap(){
        HashMap<String, SchoolYear> schoolYearsHashMap = new HashMap<>();
        for( SchoolYear s:schoolYears ) {
            schoolYearsHashMap.put(s.getYear(), s);
        }
        return schoolYearsHashMap;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        Formatter fmt = new Formatter(sb);
        fmt.format("[%s]", getClass());
        for (SchoolYear sy:schoolYears) {
            sb.append("\n  ");
            sb.append(sy.toString());
        }
        return sb.toString();
    }
}
