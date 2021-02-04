package com.two.test;

import com.two.dao.impl.CourseDaoimpl;
import com.two.entity.Course;

import java.util.List;

public class Demo {
    public static void main(String[] args) {
        CourseDaoimpl courseDaoimpl = new CourseDaoimpl();
        int delete = courseDaoimpl.delete("6");
        System.out.println(delete);
    }
}
