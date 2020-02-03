package com.javarush.task.task08.task0824;

import java.util.ArrayList;
import java.util.List;

/* 
Собираем семейство
*/

public class task0824 {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<Human> childList4 = new ArrayList<>();
        Human boy1 = new Human("Петя", true, 39, childList4);
        Human boy2 = new Human("Вова", true, 44, childList4);
        Human girl1 = new Human("Аня", false, 31, childList4);
        ArrayList<Human> childList3 = new ArrayList<>();
        childList3.add(boy1);
        childList3.add(boy2);
        childList3.add(girl1);
        Human father = new Human("Гоша", true, 59, childList3);
        Human mother = new Human("Люся", false, 54, childList3);
        ArrayList<Human> childList1 = new ArrayList<>();
        childList1.add(father);
        ArrayList<Human> childList2 = new ArrayList<>();
        childList2.add(mother);
        Human grandFather1 = new Human("Кокос", true, 79, childList1);
        Human grandFather2 = new Human("Коко", true, 79, childList2);
        Human grandMother1 = new Human("Сука", false, 69, childList1);
        Human grandMother2 = new Human("Кука", false, 69, childList2);
        System.out.println(grandFather1.toString());
        System.out.println(grandFather2.toString());
        System.out.println(grandMother1.toString());
        System.out.println(grandMother2.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(boy1.toString());
        System.out.println(boy2.toString());
        System.out.println(girl1.toString());
    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;
        public Human(String name, boolean sex, int age)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        public Human(String name, boolean sex, int age, ArrayList<Human> children)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
