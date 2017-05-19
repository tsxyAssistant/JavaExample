# 学校结构Json
可由此获取学校详细的年级系别专业班级的对应关系.

## 设计 
按现在抓取的数据分析来看, 各个年级的院系部代码和专业代码都是不变的.  
但为稳妥起见(防抽风), 仍按照教务系统原有的, 从年份开始设计json.  
学校-年级-系别(院系部)-专业-班级.

```python
classes = {'name': '14计本1', 'code': '2014020601'}  
specialty = {'name': '计算机专业与技术', 'code': '4001', 'classes': [c1, c2...]}  
department = {'name': '计算机专业与技术系', 'code': '40', 'specialties': [s1, s2...]}  
school_year = {'year': '2014', 'departments': [department1, department2...]}  
school = {'school_years': [school_year1, school_year2...]}
```

Json真实例子详见 [school.json](https://github.com/tsxyAssistant/JavaExample/blob/master/src/school.json)
