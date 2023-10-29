/*
import java.math.BigInteger;

import java.io.InputStream;

import java.io.IOException;

import java.util.Locale;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import java.util.stream.IntStream;
*/

public class Quiz {

    public static void main(String[] args) throws Exception {
        //палиндром
        /*String text = "abba";
        String sb = new StringBuilder(text.toLowerCase().replaceAll("([^a-zA-Z0-9])", "")).reverse().toString();

        if (text.toLowerCase().replaceAll("([^a-zA-Z0-9])", "").equals(sb)) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
        */

        //факториал
        /*int value = 5;
        BigInteger res = new BigInteger("1");
        for (int i = 1; i <= value; i++) {
            BigInteger temp = BigInteger.valueOf(i);
            res = res.multiply(temp);
        }

        return res;*/

        //движения робота
        /*public static void moveRobot(Robot robot, int toX, int toY) {
            int currentX = robot.getX();
            int currentY = robot.getY();
            Direction currentDirection = robot.getDirection();
        
            while (currentX != toX || currentY != toY) {
                if (currentX < toX) {
                    while (currentDirection != Direction.RIGHT) {
                        robot.turnRight();
                        currentDirection = robot.getDirection();
                    }
                    robot.stepForward();
                    currentX++;
                } else if (currentX > toX) {
                    while (currentDirection != Direction.LEFT) {
                        robot.turnRight();
                        currentDirection = robot.getDirection();
                    }
                    robot.stepForward();
                    currentX--;
                } else if (currentY < toY) {
                    while (currentDirection != Direction.UP) {
                        robot.turnRight();
                        currentDirection = robot.getDirection();
                    }
                    robot.stepForward();
                    currentY++;
                } else if (currentY > toY) {
                    while (currentDirection != Direction.DOWN) {
                        robot.turnRight();
                        currentDirection = robot.getDirection();
                    }
                    robot.stepForward();
                    currentY--;
                }
            }
        }*/

        //Ипользуем интерфейс
        // private class AsciiCharSequence implements CharSequence {
        //     private byte[] data;
            
        //     public AsciiCharSequence(byte[] data) {
        //         this.data = data;
        //     }
            
        //     public int length() {
        //         return data.length;
        //     }
            
        //     public char charAt(int index) {
        //         return (char) data[index];
        //     }

        //     public CharSequence subSequence(int start, int end) {
        //         byte[] bytes = new byte[end - start];
        //         for (int i = 0, j = start; i < end - start; ++i, ++j) {
        //             bytes[i] = data[j];
        //         }

        //         return new AsciiCharSequence(bytes);
        //     }
            
        //     public String toString() {
        //         return new String(data);
        //     }
        // }

        //Полная реализация структуры с анализом текста и использованием интерфейса
        /*interface TextAnalyzer {
            Label processText(String text);
        }

        enum Label {
            SPAM, NEGATIVE_TEXT, TOO_LONG, OK
        }

        public Label checkLabels(TextAnalyzer[] analyzers, String text) {
            for (TextAnalyzer analyzer : analyzers) {
                if (analyzer.processText(text) != Label.OK) {
                    return analyzer.processText(text);
                }
            }
            
            return Label.OK;
        }

        abstract class KeywordAnalyzer implements TextAnalyzer {
            protected abstract String[] getKeywords();
            protected abstract Label getLabel();

            public Label processText(String text) {
                String[] keywords = getKeywords();
                for (String key: keywords) {
                    if (text.contains(key)) {
                        return getLabel();
                    }
                }
                
                return Label.OK;
            }
        }

        class SpamAnalyzer extends KeywordAnalyzer {
            private final String[] keywords;

            public SpamAnalyzer(String[] keywords) {
                this.keywords = keywords;
            }

            @Override
            protected String[] getKeywords() {
                return this.keywords;
            }

            @Override
            public Label getLabel() {
                return Label.SPAM;
            }
        }

        class NegativeTextAnalyzer extends KeywordAnalyzer {    
            @Override
            protected String[] getKeywords() {
                return new String[]{":(", "=(", ":|"};
            }

            @Override
            public Label getLabel() {
                return Label.NEGATIVE_TEXT;
            }
        }

        class TooLongTextAnalyzer implements TextAnalyzer {
            private final int maxLength;

            public Label processText(String text) {
                return text.length() > maxLength ? Label.TOO_LONG : Label.OK;
            }

            public TooLongTextAnalyzer(int maxLength) {
                this.maxLength = maxLength;
            }
        }*/

        //Работа с выкидыванием ошибка и указыванием числа
        /*public static double sqrt(double x) {
            if (x < 0) {
                throw new IllegalArgumentException("Expected non-negative number, got " + x);
            }
            
            return Math.sqrt(x);
        }*/

        /*
         * Логирование и написание кода, откуда было вызвано:
         * "StackTraceElement" - Метод с помощью него возвратить строку в формате Class#Name содержащую вызвавший класс и его метод, или null, если вызова извне не было, что нам и нужно. Автор задания не двусмыслено намекает на использование "Throwable".

        т.е. Вам нужно загуглить этот метод "StackTraceElement" и скорее всего выйдете на статью https://javarush.ru/quests/lectures/questsyntaxpro.level14.lecture05 , придется эту статью дочитать до конца, т.к. вам нужно обратить внимание на "Throwable", а он описан в самом конце :)

        задачу можно решить двумя способами используя 3-4 строчки кода

        1.        Thread current = Thread.currentThread();
           StackTraceElement[] methods = current.getStackTrace();
        //в этом случае в массиве использовать 3е значение:
        if (methods.length>3) return methods[3].getClassName()+"#"+methods[3].getMethodName();

        2.  StackTraceElement[] methods;
        methods = new Throwable().getStackTrace();

        //в этом случае в массиве использовать 2е значение:
        if (methods.length>2) return methods[2].getClassName()+"#"+methods[2].getMethodName();

        и конечно иначе возвращать null.

        В будущем можно это использовать для отладки кода, чтобы понимать кто вызывает этот метод.
        */
        
        //Работа с исключениями
        /*public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
        
            RobotConnection robotConnection = null;
            int tries = 0;
            
            while(tries <= 3){
                tries++;
                try {
                    robotConnection = robotConnectionManager.getConnection();
                    robotConnection.moveRobotTo(toX, toY);
                    break;
                }
                catch (RobotConnectionException e) {
                    if(tries == 3) {
                        throw new RobotConnectionException("ERROR");
                    }
                }catch (Exception e) {
                    tries = 5;
                    throw e;
                }finally {
                    if (robotConnection != null) {
                        try {
                            robotConnection.close();
                        }catch (Exception ignore) {
                        }
                    }
                }
            }
        }*/

        //Чтение из потока байт
        /*public static int checkSumOfStream(InputStream inputStream) throws IOException {
            int res = 0;
            int ch;
            while ((ch = inputStream.read()) > -1) {
                res = Integer.rotateLeft(res, 1) ^ ch;
            }
            
            return res;
        }*/

        //Работа со считыванием данных из System.in и выводом
        /*public class Main {
            public static void main(String[] args) throws IOException {
                Scanner scanner = new Scanner(System.in);
                scanner.useLocale(Locale.ENGLISH);
                
                double sum = 0.0;
                double number;
                while (scanner.hasNext()) {
                    if (scanner.hasNextDouble()) {
                        number = scanner.nextDouble();
                        sum += number;
                    }
                    else {
                        scanner.next();   
                    }
                }
                
                System.out.printf(Locale.ENGLISH, "%.6f", sum);
            }
        }*/

        //Работа с Generics
        /*class Pair<T, U> {
            private T first;
            private U second;
            
            private static Pair<?, ?> pair;
            
            private Pair(T valueT, U valueU) {
                super();
                this.first = valueT;
                this.second = valueU;
            }
            
             public static<T, U> Pair<T, U> of(T first, U second) {
                return new Pair<>(first, second);
            }
            
            public T getFirst() {
                return this.first;
            }
            
            public U getSecond() {
                return this.second;   
            }
            
            @Override
            public boolean equals(Object object) {
                if (this == object) {
                    return true;
                }
                
                if (object == null || getClass() != object.getClass()) {
                    return false;
                }
                
                Pair other = (Pair) object;
                
                return java.util.Objects.equals(this.first, other.first) && java.util.Objects.equals(this.second, other.second);
            }
            
            @Override
            public int hashCode() {
                return java.util.Objects.hash(this.first, this.second);
            }
        }*/

        //Работа с колллекциями
        /*public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
            Set<T> set = new HashSet<>();
        
            set.addAll(set1);
        
            set.addAll(set2);
        
            Iterator<T> it = set.iterator();
        
            while (it.hasNext()) {
        
                T item = it.next();
        
                if (set1.contains(item) && set2.contains(item)) {
        
                    it.remove();
                }
        
            }
        
            return set;
        }*/

        //Работа с List и scanner
        /*class Main {
            public static void main(String[] args) {
                try (Scanner scanner = new Scanner(System.in)) {
                    scanner.useLocale(Locale.ENGLISH);

                    List<Integer> list = new ArrayList<>();

                    int count = 0;
                    while (scanner.hasNext()) {
                        if (count % 2 == 0) {
                            scanner.next();
                        }
                        else {
                            list.add(scanner.nextInt());
                        }

                        ++count;
                    }

                    Collections.reverse(list);

                    for (Integer element : list) {
                        System.out.print(element + " ");
                    }
                }
            }
        }*/

        //Использование Stream
        /*public static IntStream pseudoRandomStream(int seed) {
            return IntStream.iterate(seed, n -> ((n * n) / 10 % 1000));
        }*/

        //Работа с min и max
        /*public static <T> void findMinMax(Stream<? extends T> stream, Comparator<? super T> order, BiConsumer<? super T, ? super T> minMaxConsumer) {
            List<T> list = stream.sorted(order).collect(Collectors.toList());
            if (!list.isEmpty()) {
                minMaxConsumer.accept(list.get(0), list.get(list.size() - 1));
            } else {
                minMaxConsumer.accept(null, null);
            }
        }*/        

        //Функциональные интерфейсы
        /*@FunctionalInterface
        interface BinaryFunction<T, U, R> {
            R apply(T argument1, U argument2);
        }

        public class MyJavaClass {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                long n = scanner.nextInt();

                scanner.close();

                int result = Utils.substitution(n, digit -> {
                    switch (digit) {
                        case 5:
                            return 1;
                        case 6:
                            return 2;
                        case 7:
                            return 3;
                        case 8:
                            return 4;
                        case 9:
                            return 5;
                    }

                    return digit;
                });

                System.out.println(result);
            }
        }

        class Utils {

            public static int substitution(long n, Function<Integer, Integer> digitRule) {
                String numberAsString = String.valueOf(n);
                int result = 0;

                for (int i = 0; i < numberAsString.length(); i++) {
                    result *= 10;
                    int nextDigit = Integer.parseInt(String.valueOf(numberAsString.charAt(i)));
                    result += digitRule.apply(nextDigit);
                }

                return result;
            }
        }*/
    }
}
