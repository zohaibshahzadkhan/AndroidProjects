package com.example.android.objectserialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person {
    String name;

    public  Person(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + '}';
    }

}
public class Test {
    public  static  void  main(String[] args){
        Person zohaib = new Person("Zohaib Shahzad Khan");
        try {
            writeToFile(zohaib);
        } catch (IOException e) {
            e.printStackTrace();
        }
//
//        try {
//            readFile();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
    }

    public  static  void writeToFile(Person p ) throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("Person.bin"));
        objectOutputStream.writeObject(p);
    }

    public static void readFile() throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("Person.bin"));
        Person name = (Person) objectInputStream.readObject();
        System.out.println(name);
    }

}
