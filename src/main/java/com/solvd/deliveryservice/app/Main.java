package com.solvd.deliveryservice.app;

import com.solvd.deliveryservice.collections.*;
import com.solvd.deliveryservice.collections.LinkedList;
import com.solvd.deliveryservice.collections.PeopleLinkedList;
import com.solvd.deliveryservice.exceptions.InvalidLicenseException;
import com.solvd.deliveryservice.lambda.Convertable;
import com.solvd.deliveryservice.lambda.Detectable;
import com.solvd.deliveryservice.lambda.Generatable;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.*;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import java.util.*;
import java.util.function.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.lang.reflect.Method;

public class Main{


    private final static Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main(String[] args) throws InvalidLicenseException, IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, NoSuchFieldException {

        createTask10();
        //createTask9();
        //createTask8();
        //createTask6();
        //createTask5();
        //createTask4();
        //createTask3();

    }
    public static void createTask10() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, NoSuchFieldException {
//        Add 7 collection streaming in the hierarchy with terminal and non-terminal operations.
//        Using reflection extract information(modifiers, return types, parameters, etc)
//        about fields, constructors, methods. Create object and call method using the only reflection.


        List<Integer> listInt = Arrays.asList(2,1,3,4,5,44,2,55);
        listInt.stream().filter(e -> e % 2 == 0 ).forEach(i -> LOGGER.info("1:"+i));

        listInt.stream().sorted().forEach(i -> LOGGER.info("2: "+i));

        List<String> listString = Arrays.asList("Driver", "Supervisor", "Customer");
        listString.stream().map(String::length).forEach(i -> LOGGER.info(i));

        LOGGER.info(listString.stream().map(String::hashCode).collect(Collectors.toList()));


        List<List<Integer>> numbers = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)
        );
        Stream<Integer> flattenedStream = numbers.stream().flatMap(List::stream);
        flattenedStream.forEach(i -> LOGGER.info(i));

        LOGGER.info(listInt.stream().filter(e -> e > 3).count());

        //reflection
        Class myClass = Class.forName("com.solvd.deliveryservice.app.Route");
        LOGGER.info(("All methods including from super classes: "+ Stream.of(myClass.getMethods()).map(Method::getName).collect(Collectors.toList())));
        LOGGER.info("Only declared methods inside myclass: "+ Stream.of(myClass.getDeclaredMethods()).map(Method::getName).collect(Collectors.toList()));

        Route newRoute = new Route();
        newRoute.setId("R12932");
        LOGGER.info("Route: "+ newRoute.getId());
        Method setIdMethod = myClass.getDeclaredMethod("setId", String.class);
        setIdMethod.invoke(newRoute, "R32939");
        LOGGER.info("New Route: "+ newRoute.getId());

        Field myfield = myClass.getDeclaredField("id");
        myfield.setAccessible(true);// lets you modify private fields
        myfield.set(newRoute,"R334332");
        LOGGER.info("New Route: "+newRoute.getId());

    }
    public static void createTask9(){
//        Use at least 5 lambda functions from the java.util.function package.
//        Create 3 custom Lambda functions with generics.
//        Create 5 complex Enums(with fields, methods, blocks).

        LOGGER.info("************************ Task 9 ****************************************");
        //5 lambda functions
        Predicate<String> underMaxLength = s -> s.length() < 5;
        LOGGER.info(underMaxLength.test("hello world"));

        Function<String, Integer> converter = s -> Integer.parseInt(s);
        Integer random = converter.apply("711");
        LOGGER.info(random+" "+ random.getClass());

        List<String> words = Arrays.asList("hello", "world", "java");
        Consumer<String> printWord = s -> LOGGER.info(s);
        words.forEach(printWord);

        Supplier<Double> randomNum = () -> (Math.random() * 22);
        LOGGER.info(randomNum.get());

        UnaryOperator<Integer> increment = (n) -> n+1;
        Integer five = 5;
        LOGGER.info(increment.apply(five));

        //3 Custom Lambda Functions
        Detectable<Person> inLasVegas = p -> p.getAddress().getCity() == "Las Vegas";
        Supervisor aPerson = new Supervisor();
        aPerson.setAddress(new Address());
        aPerson.getAddress().setCity("Los Angeles");
        LOGGER.info("This person's address in Las Vegas? "+ inLasVegas.detect(aPerson));

        List<Character> charList = Arrays.asList('h','e','l','l','0');
        Convertable<Character, String> st = list -> {
            String s = "";
            for (Character c: list) {
                s = s + c.toString();

            }
            return s;
        };
        LOGGER.info(st.convert(charList));

        Generatable<Integer> generateInts = () -> (int) (Math.random() *100);
        LOGGER.info("Generate a random integer:" + generateInts.produce());

        //ENUM
        LOGGER.info("A " +PackageWeight.VERY_HEAVY + " package weights between " +
                 PackageWeight.VERY_HEAVY.getMinLB()+" to "+ PackageWeight.VERY_HEAVY.getMaxLB());


    }



    public static void createTask8() throws IOException {
//        Read text from the file and calculate the numbers of the unique words.
//        Write the result to the file. The main requirement is: using StringUtils
//        and FileUtils to implement it with minimum lines of code.

        String fileContents = FileUtils.readFileToString(new File("src/main/resources/randomText.txt"), Charset.forName("UTF-8"));

        LOGGER.info(fileContents);
        fileContents = fileContents.toLowerCase();
        Matcher matcher = Pattern.compile("(\\w+)\\b").matcher(fileContents);
        //Matcher matcher = Pattern.compile("\\b(\\w+)\\b\\s+(?i:\\b\\1\\b)").matcher(fileContents);

        Map<String, Integer> uniqueWords = new HashMap<>();

        while (matcher.find()) {

            uniqueWords.put(matcher.group(), uniqueWords.getOrDefault(matcher.group(), 0) + 1);
        }

        LOGGER.info("This file has "+ uniqueWords.values().stream().mapToInt(Integer::intValue).sum()+" words.");
        LOGGER.info("Unique words: " + uniqueWords.size()+" = "+ uniqueWords);

    }



    public static void createTask6(){
//      (replace all array with collections, at least 5 collections), add 3 generics and implement my own linkedList.
//      LinkedList (add element front of list, add element end of list, insert into list)
        com.solvd.deliveryservice.collections.LinkedList<Employee> myList = new LinkedList();

        //create employees
        Driver driver = new Driver();
        driver.setFirstName("Pepito");
        Driver driverTwo = new Driver();
        driverTwo.setFirstName("Luigi");
        Driver driverThree = new Driver();
        driverThree.setFirstName("Bowser");
        Supervisor supervisor = new Supervisor();
        supervisor.setFirstName("Mario");

        myList.addFirst(driver);
        myList.addLast(supervisor);
        myList.insertAt(1,driverTwo);
        myList.insertAt(2,driverThree);

        myList.show();

        PeopleLinkedList<Driver> driverList = new PeopleLinkedList<>();
        driverList.addFirst(driverTwo);
        driverList.show();

        DeliveryService fedex = new DeliveryService();
        fedex.setName("Fedex");

        //create a hub
        Hub myHub = new Hub();
        myHub.setName("myHubOne");

        List<Hub> arrHub = new ArrayList<>();
        arrHub.add(myHub);

        //create employees
        Driver driverOne = new Driver();
        driverOne.setFirstName("Pepito");
        Supervisor supervisorOne = new Supervisor();
        supervisorOne.setFirstName("Mario");

        //add employees to hub
        List<Employee> arrEmploy = new ArrayList<>();
        arrEmploy.addAll(Arrays.asList(driverOne,supervisorOne));
        myHub.setEmployees(arrEmploy);

        //add hub to DS
        fedex.setHubs(arrHub);
        fedex.getHubs().toString();

    }

    public static void createTask5(){

        //Task5
        // 5 exception class
        //log messages to the console,file

        LOGGER.fatal("This is an FATAL level log message!");
        LOGGER.error("This is an ERROR level log message!");
        LOGGER.warn("This is an WARN level log message");
        LOGGER.info("This is an INFO level log message");
        LOGGER.debug("This is an DEBUG level log message");
        LOGGER.trace("This is an TRACE level log message");

        Truck myTruckOne = new Truck();
        myTruckOne.refuel("gasoline");
        myTruckOne.setMileage(1000000);
        myTruckOne.setId("");

        Driver pepito = new Driver();
        //pepito.setLicenseNumber("ed332324$#$#$#%55");
        pepito.setFirstName("Pepeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");

    }

    public static void createTask4(){

        //Task 4
        // 5 Interfaces: assignable, movable, securable, loadable, workable
        // final and static : LOGGER in main

        Truck myTruck = new Truck();
        myTruck.turnLeft();

    }
//
    public static void createTask3() {

        //Task 3
        // Abstract classes.
        // Classes overriding hashCode() and Equals(): PackageDoP, Driver ,Customer

        //Use Hashcode and Equals in DSClasses.Driver Class
        Driver driverPrimero = new Driver("oto", "Pepito", " A2883", "G42452343");
        Driver driverSegundo = new Driver("oto", "Pepito", " A2883", "G42452343");

        LOGGER.info("DriverPrimero equals DriverSegundo: " + driverPrimero.equals(driverSegundo));
        LOGGER.info("DriverPrimer hasCode():" + driverPrimero.hashCode() + " and DriverSegundo hashCode(): " + driverSegundo.hashCode());


    }

}
