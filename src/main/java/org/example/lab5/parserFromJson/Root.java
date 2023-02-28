package org.example.lab5.parserFromJson;

import org.example.lab5.LabWork;
import org.example.lab5.entity.Person;

import java.util.*;

public class Root {

    private Set<LabWork> labWorkSet;

    public Root() {
        this.labWorkSet = new HashSet<>();
    }

    Comparator<LabWork> compareByMinPoint = new Comparator<LabWork>() {
        @Override
        public int compare(LabWork o1, LabWork o2) {
            return o1.getMinimalPoint() - o2.getMinimalPoint();
        }
    };

    Comparator<LabWork> compareByMinPointReverse = new Comparator<LabWork>() {
        @Override
        public int compare(LabWork o1, LabWork o2) {
            return o2.getMinimalPoint() - o1.getMinimalPoint();
        }
    };

    Comparator<LabWork> compareByID = new Comparator<LabWork>() {
        @Override
        public int compare(LabWork o1, LabWork o2) {
            return (int) (o1.getId()-o2.getId());
        }
    };

    public void setLabWorkSet(HashSet<LabWork> labWorkSet) {
        this.labWorkSet = labWorkSet;
    }

    public Set<LabWork> getLabWorkSet() {
        return labWorkSet;
    }

    @Override
    public String toString() {
        return "Root{" +
                ", labs=" + this.labWorkSet +
                '}';
    }

    public void show() {
//        List<LabWork> labWorkList = new ArrayList<>();
//        for (LabWork lab : labs) {
//            labWorkList.add(lab);
//        }

        List<LabWork> labWorkList = new ArrayList<>();
        labWorkList.addAll(labWorkSet);

        labWorkList.sort(compareByID);
        for (LabWork lab : labWorkList) {
//            System.out.println("id:" + lab.getId());
//            System.out.println("name:" + lab.getName());
//            System.out.println("coordinates: [x=" + lab.getCoordinates().getX() +
//                    ", y=" + lab.getCoordinates().getY() + "]");
//            System.out.println("minimalPoint:" + lab.getMinimalPoint());
//            System.out.println("tunedInWorks:" + lab.getTunedInWorks());
//            System.out.println("difficulty:" + lab.getDifficulty());
//            System.out.println("author: [\nname=" + lab.getAuthor().getName() +
//                    ", \nbirthday=" + lab.getAuthor().getBirthday() +
//                    "\nheight=" + lab.getAuthor().getHeight() +
//                    "\neyeColor=" + lab.getAuthor().getEyeColor() + "\n]");
//            System.out.println("---------------------");
            System.out.println(lab);
        }
    }

    public void addElement(LabWork e) {
        labWorkSet.add(e);
    }

    public void removeEl(int id) {
        int flag = 0;
        for (LabWork lab : labWorkSet) {
            if (lab.getId() == id){
                labWorkSet.remove(lab);
                flag = 1;
                break;
            }
        }
        if (flag == 0){
            System.out.println("Элемент с данным id не найден!");
        }
    }

    public void clearCollection(){
        labWorkSet.clear();
    }

    public void printUniqueTunedInWorks(){
        Set<Integer> unique = new HashSet<>();
        for (LabWork lab: labWorkSet){
            unique.add(lab.getTunedInWorks());
        }

//        unique.forEach(System.out::println);

//        for (int el: unique){
//            System.out.print(el+" ");
//        }

        printCollection(unique);
        System.out.println("\n");
    }

    private void printCollection(Collection<Integer> collection) {
        for (Integer el: collection){
            System.out.print(el+" ");
        }
    }

    public void printFieldAscendingTunedInWorks() {
        List<Integer> tunedInWorks = new LinkedList<>();
        for (LabWork lab: labWorkSet){
            tunedInWorks.add(lab.getTunedInWorks());
        }
        Collections.sort(tunedInWorks);

        printCollection(tunedInWorks);

//        for (int el: tunedInWorks){
//            System.out.print(el+" ");
//        }

        System.out.println("\n");
    }

    public void maxByAuthor() {
        List<Person> authors = new ArrayList<>();
        // вывести в метод
        for (LabWork lab: labWorkSet){
            authors.add(lab.getAuthor());
        }
        Comparator<Person> compareByName = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
               return o1.getName().compareTo(o2.getName());
            }
        };
        Person greatest = Collections.max(authors,compareByName);
        System.out.println(" ----- Автор -----");
        System.out.println("Имя: " + greatest.getName());
        System.out.println("Дата рождения: " + greatest.getBirthday());
        System.out.println("Рост: " + greatest.getHeight());
        System.out.println("Цвет глаз: " + greatest.getEyeColor());
    }

    public void addIfMax(LabWork e) {
        LabWork maximum = Collections.max(labWorkSet,compareByMinPoint);
        if ((e.getMinimalPoint() - maximum.getMinimalPoint()) > 0){
            labWorkSet.add(e);
        }
    }

    public void removeGreater(LabWork e){
        List<LabWork> labWorks = new LinkedList<>();
        for (LabWork lab: labWorkSet){
            labWorks.add(lab);
        }
        labWorks.sort(compareByMinPointReverse);
        for (LabWork el:labWorks) {
            if(el == e){break;}
            labWorkSet.remove(el);
        }
    }

    public void removeLower(LabWork e){
        List<LabWork> labWorks = new LinkedList<>();
        for (LabWork lab: labWorkSet){
            labWorks.add(lab);
        }
        labWorks.sort(compareByMinPoint);
        for (LabWork el:labWorks) {
            if(el == e){break;}
            labWorkSet.remove(el);
        }
    }

    public void update(int id, LabWork e) {
        boolean flag = true;
        for (LabWork lab: labWorkSet) {
            if (lab.getId() == id) {

                lab.setName(e.getName());
                lab.setAuthor(e.getAuthor());
                lab.setCoordinates(e.getCoordinates());
                lab.setDifficulty(e.getDifficulty());
                lab.setMinimalPoint(e.getMinimalPoint());
                lab.setTunedInWorks(e.getTunedInWorks());
                flag = false;

//                labWorkSet.remove(lab);
//                labWorkSet.add(e);
////                e.setId(id);
                break;
            }

            if (flag) {
                System.out.println(" Элемент с данным ID отсутствует ");
            }
        }
    }
}
