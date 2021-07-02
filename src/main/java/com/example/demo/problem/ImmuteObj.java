package com.example.demo.problem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ImmuteObj {

    private final String testName;
    private final List<String> testList;

    // Deep cloning
    public ImmuteObj(String testName, List<String> testList) {

        this.testName = testName;

        List<String> copyList = new ArrayList<>();
        testList.forEach(e -> copyList.add(e));
        this.testList = copyList;

    }

    //declare only getters
    public String getTestName() {
        return testName;
    }

    public List<String> getTestList() {
        return testList;
    }

    @Override
    public String toString() {
        return "Name " + testName + " list = " + testList;
    }

    public static void main(String[] args) {

        String testName = "Yathi";
        List name = new ArrayList();
        name.add("one");
        name.add("two");

        ImmuteObj immuteObj = new ImmuteObj(testName, name);
        System.out.println(immuteObj);

        testName = "Raj";
        name.add("Good");

        System.out.println(immuteObj);

    }

}
