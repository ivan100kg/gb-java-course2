package io.github.ivan100kg.homework9;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class MainApp {
    public static void main(String[] args) throws SQLException {
        Student student1 = new Student("Ivan", 39);
        Student student2 = new Student("Egor", 44);
        Student student3 = new Student("Inna", 24);
        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        Connection conn = null;
        Statement stmt = null;

        Class<Student> studentCl = Student.class;
        if (studentCl.isAnnotationPresent(Table.class)) {
            try {
                Class.forName("org.sqlite.JDBC");
                conn = DriverManager.getConnection(
                        "jdbc:sqlite:main.db"
                );
                String tableName = studentCl.getAnnotation(Table.class).title();

                // CREATE TABLE students (id INTEGER, name TEXT, age INTEGER);
                StringBuilder sb = new StringBuilder("CREATE TABLE ");
                sb.append(tableName).append(" (");


                Field[] fields = Student.class.getDeclaredFields();

                Map<Class<?>, String> map = new HashMap<>();
                map.put(String.class, "TEXT");
                map.put(int.class, "INTEGER");

                for (Field f : fields) {
                    if (f.isAnnotationPresent(Column.class))
                        sb.append(f.getName())
                                .append(" ")
                                .append(map.get(f.getType()))
                                .append(", ");
                }

                sb.delete(sb.length()-2, sb.length());
                sb.append(");");
                System.out.println(sb);
                stmt = conn.createStatement();
                stmt.executeUpdate(sb.toString());
            } catch (ClassNotFoundException | SQLException e) {
                throw new RuntimeException(e);
            } finally {
            }
        }

    }
}
