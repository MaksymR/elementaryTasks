package com.softserve.dp_171_java.elementary.triangles.console;

import com.softserve.dp_171_java.elementary.triangles.core.TriangleMathMethods;
import com.softserve.dp_171_java.elementary.triangles.core.impl.TriangleMathMethodsImpl;
import com.softserve.dp_171_java.elementary.triangles.entity.Triangle;
import com.softserve.dp_171_java.elementary.triangles.util.MaxAreaTriangleComparator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class WorkWithTriangles {

    private List<Triangle> trianglesList = new ArrayList<>();
    private TriangleMathMethods triangleMathMethods = new TriangleMathMethodsImpl();


    public void workWithTriangles() {
        try {

            while (true) {
                System.out.println("Enter the data of the triangle in next format" +
                        " (with using a coma as a delimiter):");
                System.out.println("<name number>, <length of sideA>, <length sideB>, <length of sideC>");
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                String trianglesData = bufferedReader.readLine();

                String[] arrayTrianglesDate = workWithInputString(trianglesData);
                if (arrayTrianglesDate == null) {
                    break;
                }

                workWithTriangle(arrayTrianglesDate);

                if (exitAndGetResults(bufferedReader)) {
                    break;
                }
            }
        } catch (NumberFormatException ex) {
            System.out.println("You have inputted a wrong format for the parameter of triangle\'s side" +
                    " (look at the format above, please). Try again, please");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Not a correct inputting format (look at the format above, please)." +
                    " Try again, please");
        } catch (IOException ex) {
            System.out.println(ex);
        }

    }

    private String[] workWithInputString(String trianglesData) {

        /*
           1. Zero or more whitespaces (\\s*)
           2. Arrow, or comma, or whitespace (=>|,|\\s)
           3. Zero or more whitespaces (\\s*)
         */
        String[] arrayTrianglesDate = trianglesData.split("\\s*(=>|,|\\s)\\s*");
        if (arrayTrianglesDate.length > 5) {
            System.out.println("It was inputted a lot of parameters. (look at the format above, please)." +
                    " Try again, please");
            return null;
        }
        return arrayTrianglesDate;
    }

    private void workWithTriangle(String[] arrayTrianglesDate) {
        String triangleName = arrayTrianglesDate[0] + " " + arrayTrianglesDate[1];
        double sideA = getTrianglesSide(arrayTrianglesDate[2]);
        if (checkTriangleSide(sideA)) {
            return;
        }
        double sideB = getTrianglesSide(arrayTrianglesDate[3]);
        if (checkTriangleSide(sideB)) {
            return;
        }
        double sideC = getTrianglesSide(arrayTrianglesDate[4]);
        if ((checkTriangleSide(sideC))) {
            return;
        }
        Triangle triangle = new Triangle(sideA, sideB, sideC, triangleName);
        triangle.setArea(triangleMathMethods.calculateTriangleAreaByHeron(triangle));
        trianglesList.add(triangle);
    }

    private boolean checkTriangleSide(double triangleSide) {
        if (triangleSide <= 0) {
            System.out.println("Don't enter a negative number or zero, please");
            return true;
        }
        return false;
    }

    private double getTrianglesSide(String s) {

        double sideTriangle = Double.parseDouble(s);
        return sideTriangle;

    }

    private boolean exitAndGetResults(BufferedReader bufferedReader) throws IOException {
        System.out.println("\nDo you want to continue?");
        System.out.println("Enter please \"y\" or \"yes\" (you can ignore character case).");
        System.out.println("If you want to exit then type another else, please.");

        String exitOrNo = bufferedReader.readLine();
        boolean exitY = exitOrNo.equalsIgnoreCase("y");
        boolean exitYes = exitOrNo.equalsIgnoreCase("yes");
        if ((!exitY) && (!exitYes)) {
            sortTriangles(trianglesList);
            printTriangles(trianglesList);
            bufferedReader.close();
            return true;
        }
        return false;
    }

    private void sortTriangles(List<Triangle> list) {

        Comparator<Triangle> comparator = new MaxAreaTriangleComparator();
        Collections.sort(list, comparator);

    }

    private void printTriangles(List<Triangle> list) {

        int count = 1;
        System.out.println("============= Triangles list: ===============");
        for (Triangle triangle : list) {
            System.out.println(count + " " + triangle.toString());
            count++;
        }

    }
}
