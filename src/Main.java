import java.util.*;

public class Main {
    public static void main(String[] args) {
        problem1();
        problem2();
        problem3();
        problem4();
        problem5();
        problem6();
        problem7();
        problem8();
        problem9();
        problem10();
        problem11();
        problem12();
        problem13();
        problem14();
        problem15();
        problem16();
        problem17();
        problem18();
        problem19();
        problem20();
    }

    public static void problem1() {
        ArrayList<String> books1 = new ArrayList<>(Arrays.asList("Java", "Python", "C++"));
        ArrayList<String> books2 = new ArrayList<>(Arrays.asList("Python", "JavaScript", "Java"));
        ArrayList<String> merged = new ArrayList<>(books1);
        for (String book : books2) {
            if (!merged.contains(book)) {
                merged.add(book);
            }
        }
        System.out.println("Problem 1: " + merged);
    }

    public static void problem2() {
        ArrayList<String> movies = new ArrayList<>(Arrays.asList("Inception", "Titanic", "Avatar", "The Godfather"));
        String longest = movies.get(0);
        for (String movie : movies) {
            if (movie.length() > longest.length()) {
                longest = movie;
            }
        }
        System.out.println("Problem 2: " + longest);
    }

    public static void problem3() {
        ArrayList<String> foods = new ArrayList<>(Arrays.asList("Pizza", "Burger", "Pizza", "Pasta", "Pizza"));
        int count = 0;
        for (String food : foods) {
            if (food.equals("Pizza")) {
                count++;
            }
        }
        System.out.println("Problem 3: " + count);
    }

    public static void problem4() {
        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("Apple", "Banana", "Orange", "Banana", "Grape"));
        fruits.removeAll(Collections.singleton("Banana"));
        System.out.println("Problem 4: " + fruits);
    }

    public static void problem5() {
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue", "Yellow"));
        Collections.fill(colors, "Black");
        System.out.println("Problem 5: " + colors);
    }

    public static void problem6() {
        ArrayList<String> sports = new ArrayList<>(Arrays.asList("Basketball", "Football", "Tennis", "Cricket"));
        ArrayList<String> sublist = new ArrayList<>(Arrays.asList("Football", "Tennis"));
        boolean contains = Collections.indexOfSubList(sports, sublist) != -1;
        System.out.println("Problem 6: " + contains);
    }

    public static void problem7() {
        ArrayList<String> flowers = new ArrayList<>(Arrays.asList("Lily", "Rose", "Tulip", "Rose", "Daisy"));
        int first = flowers.indexOf("Rose");
        int last = flowers.lastIndexOf("Rose");
        System.out.println("Problem 7: First = " + first + ", Last = " + last);
    }

    public static void problem8() {
        ArrayList<String> animals = new ArrayList<>(Arrays.asList("Dog", "Cat", "Dog", "Elephant", "Cat", "Lion"));
        ArrayList<String> unique = new ArrayList<>();
        for (String animal : animals) {
            if (!unique.contains(animal)) {
                unique.add(animal);
            }
        }
        System.out.println("Problem 8: " + unique);
    }

    public static void problem9() {
        ArrayList<String> cities = new ArrayList<>(Arrays.asList("New York", "London", "Tokyo", "Paris"));
        String[] array = cities.toArray(new String[0]);
        System.out.println("Problem 9: " + Arrays.toString(array));
    }

    public static void problem10() {
        Integer[] numbers = {1, 2, 3, 4, 5};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(numbers));
        System.out.println("Problem 10: " + list);
    }

    public static void problem11() {
        ArrayList<String> countries1 = new ArrayList<>(Arrays.asList("USA", "Canada", "Mexico", "Brazil"));
        ArrayList<String> countries2 = new ArrayList<>(Arrays.asList("Canada", "Brazil", "Argentina", "Chile"));
        ArrayList<String> common = new ArrayList<>();
        for (String country : countries1) {
            if (countries2.contains(country)) {
                common.add(country);
            }
        }
        System.out.println("Problem 11: " + common);
    }

    public static void problem12() {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("John", "Anna", "Michael", "Kate", "Alex"));
        names.removeIf(name -> name.length() % 2 == 0);
        System.out.println("Problem 12: " + names);
    }

    public static void problem13() {
        ArrayList<String> songs = new ArrayList<>(Arrays.asList("Bohemian Rhapsody", "Imagine", "Yesterday", "Hey Jude"));
        String shortest = songs.get(0);
        for (String song : songs) {
            if (song.length() < shortest.length()) {
                shortest = song;
            }
        }
        System.out.println("Problem 13: " + shortest);
    }

    public static void problem14() {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("hello", "world", "java", "programming"));
        for (int i = 0; i < words.size(); i++) {
            words.set(i, words.get(i).replaceAll("[aeiouAEIOU]", "*"));
        }
        System.out.println("Problem 14: " + words);
    }

    public static void problem15() {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for (int num : numbers) {
            if (num % 2 == 0) {
                even.add(num);
            } else {
                odd.add(num);
            }
        }
        System.out.println("Problem 15: Even = " + even + ", Odd = " + odd);
    }

    public static void problem16() {
        ArrayList<String> days = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));
        Collections.rotate(days, 2);
        System.out.println("Problem 16: " + days);
    }

    public static void problem17() {
        ArrayList<String> students = new ArrayList<>(Arrays.asList("Alice", null, "Bob", "Charlie", null, "David"));
        students.removeAll(Collections.singleton(null));
        System.out.println("Problem 17: " + students);
    }

    public static void problem18() {
        ArrayList<String> movies = new ArrayList<>(Arrays.asList("Inception", "Titanic", "Avatar", "The Godfather", "Up"));
        ArrayList<String> sorted = new ArrayList<>(movies);
        sorted.sort((a, b) -> b.length() - a.length());
        String secondLongest = sorted.get(1);
        System.out.println("Problem 18: " + secondLongest);
    }

    public static void problem19() {
        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("Apple", "Banana", "Cherry", "Date"));
        ArrayList<Integer> lengths = new ArrayList<>();
        for (String fruit : fruits) {
            lengths.add(fruit.length());
        }
        System.out.println("Problem 19: " + lengths);
    }

    public static void problem20() {
        ArrayList<ArrayList<String>> departments = new ArrayList<>();
        ArrayList<String> hr = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie"));
        ArrayList<String> it = new ArrayList<>(Arrays.asList("David", "Eve", "Frank"));
        ArrayList<String> sales = new ArrayList<>(Arrays.asList("Grace", "Henry"));
        departments.add(hr);
        departments.add(it);
        departments.add(sales);
        System.out.println("Problem 20: " + departments);
    }
}