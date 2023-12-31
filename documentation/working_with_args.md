# Тут будут отписаны методы работы с разными типами данных(примитивными и ссылочными)

Package в Java используется для организации и структурирования классов и интерфейсов в логические группы. Он помогает предотвратить конфликты имен между классами, облегчает управление и поддержку кода, а также обеспечивает модульность и повторное использование.

## Ниже приведены некоторые преимущества использования package в Java:

- **Организация кода:** Package позволяет организовать классы и интерфейсы в логические группы, что упрощает понимание и поддержку кода. Классы, относящиеся к одной функциональности или модулю, могут быть объединены в один package.
- **Изоляция имен:** Package предотвращает конфликты имен между классами, так как имена классов внутри одного package должны быть уникальными. Это позволяет избежать конфликтов имен и облегчает разработку и поддержку кода.
- **Модульность и повторное использование:** Package может быть использован для создания модулей, которые могут быть повторно использованы в других проектах. Модули могут содержать набор классов и интерфейсов, связанных с определенным функциональным блоком, что облегчает повторное использование кода.
- **Управление видимостью:** Package определяет уровень видимости классов и интерфейсов. Классы и интерфейсы, объявленные внутри package, могут быть доступны только внутри этого package или в других классах, которые находятся в том же package.

## Types - примитивные:
1) boolean
2) char
3) byte, short, int, long
4) float, double

> [!NOTE]
> Все примитивные типы передаются по значению, а все остальные типы по ссылкам

Длинная арефметика:
import java.math.*
BigInteger, BigDecimal

### Удобства:
1) MAX_VALUE - Integer.NAX_VALUE - максимальное значение
2) bitcount - возвращает количество бит равных 1
3) isLetter - проверка на букву
4) POSITIVE_INFINITY
5) NaN
6) isNaN(double)

# Casts:
1) Для перевода int к String мы можем использовать Integer.toString();
2) Для перевода из String в int мы можем использовать Integer.valueOf(string)/Integer.parseInt(str);

> [!IMPORTANT]
> valueOf вернет Integer, а parseInt вернет int

3) Для перевода char к int мы можем использовать Character.getNumericValue();
4) Если хоти перевести строку в массив char, то используем s.toCharArray(), где s - String;

# String:

В классе String имеется очень полезный метод split(). С помощью этого метода можно разделить имеющуюся строку на массив типа String[].
```java
String str = "I'll be back";
String[] words = str.split(" ");
```
## Методы String:
substring(...,...) - подстрока с чего-то по что-то
string.indexOf(str) - возвращает индекс первого вхождения символа или строки
string.charAt(index) - символ в строке по индексу
string.contains(symbol) - есть ли данный символ в строке
string.length() - длина строки
string.equals(string) - сравнение двух строк
string.isEmpty() - проверка на пустоту
string.toUpperCase() / toLowerCase() - перевод строки в верхний и нижний регистры

## Сравнение String:
```java
public class Main {
   public static void main(String[] args) {
       String s1 = "JavaRush - лучший сайт для изучения Java!";
       String s2 = new String("JavaRush - лучший сайт для изучения Java!");
       System.out.println(s1 == s2);
   }
}
```
Будет выведено false, но если:
```java
public class Main {
   public static void main(String[] args) {
       String s1 = "JavaRush - лучший сайт для изучения Java!";
       String s2 = "JavaRush - лучший сайт для изучения Java!";
       System.out.println(s1 == s2);
   }
}
```
Вывод будет true. Так работает, потому что в этом случае ссылки на эти две строчкм равны.
> [!IMPORTANT]
> "==" - всегда сравнивает ссылки!

Для строк существует String Pool, тк строк обычно в программах много, то чтобы экономить память, проверяется есть ли такая строка в Pool, если есть, то новая создаваться не будет.

> [!IMPORTANT]
> Оператор "new" принудительно выделяет новую область в памяти

Для сравнения самих строк, а не ссылок следует использовать такой способ:
```java
public class Main {
   public static void main(String[] args) {
       String s1 = "JavaRush - лучший сайт для изучения Java!";
       String s2 = new String("JavaRush - лучший сайт для изучения Java!");
       System.out.println(s1.equals(s2));
   }
}
```

Если же необходимо сравнить без учета регистра, то:
```java
public class Main {
   public static void main(String[] args) {
       String address1 = "г. Москва, ул. Академика Королева, дом 12";
       String address2 = new String("Г. МОСКВА, УЛ. АКАДЕМИКА КОРОЛЕВА, ДОМ 12");
       System.out.println(address1.equalsIgnoreCase(address2));
   }
}
```

> [!TIP]
> У класса String есть еще один хитрый метод — intern(); \
> Метод intern() напрямую работает со String Pool’ом. Если ты вызываешь метод intern() у какой-то строки, он: \
> Смотрит, есть ли строка с таким текстом в пуле строк \
> Если есть — возвращает ссылку на нее в пуле \
> Если же нет — помещает строку с этим текстом в пул строк и возвращает ссылку на нее. \
> Применив метод intern() к ссылке на строку, которая создавалась через new, мы можем сравнивать ее со ссылкой на строку из String Pool’a через оператор ==. 

## Подстроки:
```java
String str = "Добро пожаловать в мир Java!";
System.out.println(str.substring(6)); - пожаловать в мир Java!
System.out.println(str.substring(6, 15)); - пожаловат
```
## Замена символов в строке:
```java
String str = "Добро пожаловать в мир Java!";
System.out.println(str.replace('о', 'А')); //ДАбрА пАжалАвать в мир Java!
```
Если нужно просто вывести число с определённым количеством знаков после запятой, можно использовать для этого форматирование строк:
```java
double x = 25.364789;
String formatted = String.format("%.3f", x);
System.out.println(formatted);    // 25.365
```
Если мы хотим добавить разделение между словами в String при добавление, то может использовать StringJoiner, где в скобках указать разделитель;

# Массивы:
Массив является объектом и неявно наследуется от Object, поэтому имеет все его методы

length - в массивах это поле(public final) и вычисляется оно при создание массива

1 вариант передать массив:
```java
static boolean mV(int[] array) {
        return true;
} => if (mV(new int[] {1, 2, 3})) {
            System.out.println("nice");
        }
```
2 вариант передать массив:
```java
static boolean mV(int... array) {
        return true;
} => if (mV(1, 2, 3)) {
            System.out.println("nice");
        }
```
## Создание массивов:
```java
int[] a = new int[];
int[] a = {...};
int[] a = new int[] {...};
```

Важно отметить, что в массивах хранятся не объекты, а ссылки на них, а сами объекты хранятся в куче.

## Копирование массивов:
1) System.arraycopy() - копирование массива, имеет native нотацию, что означает, что реализация написана на другом языке
2) Arrays.copyOf() - копирование массива с использованием Arrays - имеет под капотом прошлый способ копирования
Оба этих способа не уступают друг другу по времени

## Сравнение массивов:
```java
int[] a = {1, 2, 3};
int[] b = {1, 2, 3};
```
> [!IMPORTANT]
> 1) a == b - сравнит ссылки
> 2) a.equals(b) - сравнит ссылки
3) Arrays.equals(a, b) - сравнит значения

> [!WARNING]
> Не сработает для многомерных массивов

```java
class Solution {
    public static void main(String[] args) {
        int[][] arr1 = {{1, 2}, {2}, {3, 5}};
        int[][] arr2 = {{1, 2}, {2}, {3, 5}};

        System.out.println(Arrays.deepEquals(arr1, arr2));
    }
}
```
Необходимо использовать Arrays.deepEquals(...,...)

> [!IMPORTANT]
> [Для массивов с собственными объектами будет необходимо переопределить equals](https://github.com/LaWeite/Annotation_for_Java/blob/8bdce64be3823cbcb20b01d545646733c4c10fe7/practice/equalsAndCopy.java)

## Вывод массива:
```java
int[] a = {1, 2, 3};
System.out.print(Arrays.toString(a));
```
Вывод будет: [1, 2, 3]
Если же мы хотим вывести без скобок и через пробелы, то:
1) Воспользоваться for
2) ```java
   int[] nums = {2, 4, 6, 8, 10};
   String str = Arrays.toString(nums);
   System.out.println(str.replaceAll("\\[|\\]|\\,", ""));
   ```
> [!WARNING]
> Не сработает для многомерных массивов

```java
class Solution {
    public static void main(String[] args) {
        int[][] arr1 = {{1, 2}, {2}, {3, 5}};
        int[][] arr2 = Arrays.copyOf(arr1, arr1.length);
        
        System.out.println(Arrays.deepToString(arr2));
    }
}
```
Необходимо использовать deepToString()

## Заполнение массива:
```java
int[] nums = new int[4];
Arrays.fill(nums, 36);
System.out.println(Arrays.toString(nums));
```
Вывод [36,36,36,36]
