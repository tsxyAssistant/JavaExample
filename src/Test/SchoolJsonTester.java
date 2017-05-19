package Test;

import SchoolJson.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/**
 * Created by bllli on 17-5-19.
 */
public class SchoolJsonTester {
    public static void run() throws IOException {
        try (Reader reader = new InputStreamReader(School.class.getResourceAsStream("/school.json"), "UTF-8")) {
            Gson gson = new GsonBuilder().create();
            School aSchool = gson.fromJson(reader, School.class);
            // System.out.println(aSchool);
            // System.out.println("keys:" + keysArray);
            System.out.println("\n-------------------\n寻找开始!");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            // 找年级
            HashMap<String, SchoolYear> schoolYearsHashMap = aSchool.getSchoolYearsHashMap();
            Set<String> keys = schoolYearsHashMap.keySet();
            ArrayList<String> schoolYearKeys = new ArrayList<>(keys);
            printStringArrayList(schoolYearKeys);
            SchoolYear sy = schoolYearsHashMap.get(schoolYearKeys.get(Integer.parseInt(br.readLine())));
            // 找系
            HashMap<String, Department> departmentHashMap = sy.getDepartmentsHashMap();
            ArrayList<String> departmentKeys = new ArrayList<>(departmentHashMap.keySet());
            printStringArrayList(departmentKeys);
            Department department = departmentHashMap.get(departmentKeys.get(Integer.parseInt(br.readLine())));
            //找专业
            HashMap<String, Specialty> specialtyHashMap = department.getSpecialtiesHashMap();
            ArrayList<String> specialtyKeys = new ArrayList<>(specialtyHashMap.keySet());
            printStringArrayList(specialtyKeys);
            Specialty specialty = specialtyHashMap.get(specialtyKeys.get(Integer.parseInt(br.readLine())));
            //找班
            HashMap<String, _Class> classHashMap = specialty.getClassesHashMap();
            ArrayList<String> classKeys = new ArrayList<>(classHashMap.keySet());
            printStringArrayList(classKeys);
            _Class c = classHashMap.get(classKeys.get(Integer.parseInt(br.readLine())));
            System.out.println(c);
        }
    }

    private static void printStringArrayList(ArrayList<String> array){
        for(int i=0; i<array.size(); i++){
            System.out.printf("%d %s\n", i, array.get(i));
        }
    }
}
