package com.Chapter10.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestStudent {
    public static void main(String[] args) {

         Student zlj = new Student("奧鈴", 21);
         Student dxy = new Student("巴比倫", 22);
         Student cjc = new Student("王", 11);
         Student lgc = new Student("張", 19);

         List<Student> studentList = new ArrayList<Student>();
         studentList.add(zlj);
         studentList.add(dxy);
         studentList.add(cjc);
         studentList.add(lgc);
         for (Student student : studentList) {
             System.out.println(student.getName());
            }
         System.out.println();
         System.out.println("按姓名排序：");
         Collections.sort(studentList, new SortByName());
         for (Student student : studentList) {
          System.out.println(student.getName());
         }
        }
       }

       class SortByName implements Comparator {
        public int compare(Object o1, Object o2) {
         Student s1 = (Student) o1;
         Student s2 = (Student) o2;
         return s1.getName().compareTo(s2.getName());
        }
}
