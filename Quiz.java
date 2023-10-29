/*
1. Класс.

В Java каждая исполняемая строка кода должна находиться внутри определённой группы команд, которая называется классом. Можно сказать, что класс - это шаблон, описывающий поведение объекта. В нашем примере мы назвали класс MyClass. Содержимое класса помещается внутри фигурных скобок {}.

В нашем примере с автомобилем класс - это чертёж, то есть, абстрактный образец, по которому можно собрать конкретный автомобиль.  

2. Метод.

Внутри класса у каждой программы есть точка входа, которой является метод, называющийся main. Содержимое метода также находится внутри фигурных скобок. В целом, фигурные скобки используются во многих языках програмирования для выделения групп команд, функций или методов. Такое выделение может показаться неудобным (особенно тем, кто программирует на Python или подобных языках), однако в реальной разработке может быть гораздо функциональнее, чем другие способы выделения. 

Методы описывают поведение объекта внутри класса. Класс может содержать несколько методов, но главный метод main - обязательно..

В нашем примере с автомобилем методы - это действия, которые может выполнять автомобиль, например "ехать вперёд", "открыть дверь", "включить габариты".

3. Объект.

Объект - это экземпляр класса. В нашем примере это готовый конкретный автомобиль. Подобно тому, как по одним и тем же чертежам может быть создано множество автомобилей, внутри класса может быть создано множество объектов класса.

4. Переменные экземпляра.

Переменные экземпляра - это уникальный набор характеристик объекта. Состояние объекта передаётся значениями переменных. Грубо говоря, конкретный автомобиль имеет цвет, размеры, грузоподъёмность, в данный момент времени может ехать, а может стоять и т.д.

static означает, что метод может работать без образования экземпляра класса. Например, если мы хотим посчитать высоту конкретного здания, то нам понадобится это здание (это и есть экземпляр класса), иначе будет нечего измерять. Если же требуется  вывести на печать фразу "Hello, World!", то ничего такого нам не потребуется.

System - это класс, а out - поток, используемые для доступа к методу println.

types - примитивные:
1) boolean
2) char
3) byte, short, int, long
4) float, double

Длинная арефметика:
import java.math.*
BigInteger, BigDecimal

Удобства:
1) MAX_VALUE
2) bitcount
3) isLetter
4) POSITIVE_INFINITY
5) NaN
6) isNaN(double)

Массивы:
int[] numbers = new int[100] - лучше так
boolean bits[]

numbers.length - длина массива

int[][] natrix = new int [2][2]

static int mV(int[] array) {...} - mV(1,2,3)
static int mV(int... array) {...} - mV(1,2,3)

Сравнение двух массивов
a == b - сравнивает указывают ли ссылки на один адрес
a.equals(b) - для массивов тоже ссылки

import java.util.Arrays;
Arrays.equals(a, b) - для 1-мерных
Arrays.deepequals(a, b) - для 2-мерных и тд

Напечатать массив
println(a) - не сработает
println(Arrays.toString(a)) - для 1-мерных
println(Arrays.deepToString(a)) - для 2-мерных и тд

Строки

В конце нет нулевых символов!

String hello = "Hello";
char[] charArray = {'a', 'b', 'c'};
String string = new String(charArray);
char[] charsFromString = string.toCharArray();

Содержание строки менять нельзя, только читать

s.length();
s.charAt(0);
s.endsWith("table");
s.contains("Is");
s.substring(0, 6);
s.replace("Imm", "M");
s.toUpperCase();

Чтобы менять
StringBuilder sb = new StringBuilder();
sb.toString();

Сравнение
s1=s2 - опять ссылки
s1.equals(s2) - обычное сравнение
s1.equalsIgnoreCase(s2) - сравнение без учета регистра

Циклы:
outer: - метка, а дальше насолько бы не был вложен break outer и выйдет из всех

Нет const - только static final

В конструкторах нет параметров по умолчанию(можно сохдать два)

Если хеш-коды разные, то и входные объекты гарантированно разные.
Если хеш-коды равны, то входные объекты не всегда равны.
Если объекты одинаковые, то и хеш-коды одинаковые (но не наоборот)
Если для одного и того-же объекта вычислить хеш-код несколько раз он будет одинаковым.

@Override - чтобы показать, что метод перегружен

Абстрактные классы
   
Кроме обычных классов в Java есть абстрактные классы. Абстрактный класс похож на обычный класс.
В абстрактном классе, также можно определить поля и методы, но в то же время нельзя создать объект 
или экземпляр абстрактного класса. 
Абстрактные классы призваны предоставлять базовый функционал для классов-наследников. 
А производные классы уже реализуют этот функционал.

При определении абстрактных классов используется ключевое слово abstract:
Для того чтобы полностью понимать картину абстрактный классов и методов нужно владеть таким понятием как ООП. 
Ведь абстрактные классы чаще всего используются при реализации наследования.
Целью является функционирование в качестве базы для подклассов.

И еще отличие состоит в том, что мы не можем использовать конструктор абстрактного класса 
для создания его объекта. Не сработает: Human h = new Human();

Кроме обычных методов абстрактный класс может содержать абстрактные методы. 
Что такое абстрактный метод? Общая форма
Абстрактный метод – это метод, реализация которого в программе не имеет никакого смысла.
Абстрактный метод – это только объявление формы (интерфейса) а не реализация. 
Как и в случае с абстрактным классом, абстрактный метод начинается из ключевого слова abstract.
Если в классе объявлен абстрактный метод, то класс также считается абстрактным. 
В этом случае перед именем класса также ставится ключевое слово abstract.
Такие методы определяются с помощью ключевого слова abstract и не имеют никакой реализации
Производный класс обязан переопределить и реализовать все абстрактные методы, 
которые имеются в базовом абстрактном классе. 
Также следует учитывать, что если класс имеет хотя бы один абстрактный метод, 
то данный класс должен быть определен как абстрактный.

Зачем нужны абстрактные классы? 
Абстрактный класс – это класс, содержащий методы, которые не имеют реализации.
Абстрактный класс создается с целью создания общего интерфейса между разными реализациями классов, 
которые будут производными от абстрактного класса. 
Абстрактный класс создается для определения некоторых общих черт производных от него классов, 
которые определяют конкретную его реализацию.
Запрещено (нет смысла) создавать объект абстрактного класса.

Общая форма объявления абстрактного класса следующая:

abstract class ClassName {
    // class methods and variables
    ...
    abstract type AbstractMethod1(parameters1);
    abstract type AbstractMethod2(parameters2);
    ...
    abstract type AbstractMethodN(parametersN);
}

Чтобы использовать абстрактный класс, вам нужно наследовать его из другого класса, 
обеспечить реализацию абстрактных методов в нём.
Если вы наследуете абстрактный класс в Java, вам нужно обеспечить реализацию 
всех абстрактных методов в нём.


Допустим, мы делаем программу для обслуживания банковских операций и определяем в ней три класса:
 Person, который описывает человека, Employee, который описывает банковского служащего,
 и класс Client, который представляет клиента банка. 
Очевидно, что классы Employee и Client будут производными от класса Person, 
так как оба класса имеют некоторые общие поля и методы. 
И так как все объекты будут представлять либо сотрудника, либо клиента банка, 
то напрямую мы от класса Person создавать объекты не будем. 
Поэтому имеет смысл сделать его абстрактным.

Другим хрестоматийным примером является система геометрических фигур. 
В реальности не существует геометрической фигуры как таковой. 
Есть круг, прямоугольник, квадрат, но просто фигуры нет. 
Однако же и круг, и прямоугольник имеют что-то общее и являются фигурами.

https://www.bestprog.net/ru/2019/04/01/abstract-classes-abstract-methods-keyword-abstract-examples-ru/
https://metanit.com/java/tutorial/3.6.php
https://java-blog.ru/osnovy/abstraktnye-klassy-metody-java
http://proglang.su/java/abstraction

Интерфейсы - все методы публичные и абстрактные
Поля - публичные статические финальные
Есть default методы
В классе может быть любое количество интерфейсов
Реализуемые классов интерфейсы перечисляются с помощью слова implements, а также может быть использовано и наследования от класса вместе с этим

@FunctionalInterface - аннотация, которая показывает, что у нас функциональный интерфейс, а это интерфейс с один абстрактным методом

Можно декларировать классы прямо в теле метода

extends - наследоваться

Исключения: храняться в java.lang.Throwable
throw new IllegalStateException("Invalid User. " + "Please replace user and contionue.")

Классификация исключений:
java.lang.Error
java.lang.Exception(checked)
java.lang.RuntimeException(unchecked)

java.lang.Throwable - Базовый класс для всех исключений
java.lang.Exception - Базовый класс для проверяемых исключений, соответствующих ошибкам программной логики
java.lang.RuntimeException - Базовый класс для непроверяемых исключений, соответствующих ошибкам программной логики
java.lang.Error - Базовый класс для исключений, соответствующих ошибкам виртуальной машины

Для обрабботки исключений есть блоки try и catch:
try {

} catch (CalculatorException e) {
    
} - определенная ошибка

try {

} catch (Exception e) {
    
} - любая ошибка, кроме ошибок виртуальной машины

try {

} catch (Throwable e) {
    
} - любая ошибка, а также ошибки виртуальной машины

Также есть блок finally - он выполняется всегда, незаивисимо от того, что было исключение или нет, и выполняется самый последний

Чтобы не мучаться и не терять ошибки в finally был добавлен блок try с ресурсами, если их несколько, то перечислить надо через точку с запятой.
В конце все ресурсы надо освободить:
try (Resource r = new Resource()) {
    // ...
} catch (Exception e) {
    System.err.println("catch");
}

Ресурс - это любой объект реализующий интерфейс java.lang.AutoCloseable

Файлы:
java.io.File

File java = new File("name"/way);

java.exists() - существование
java.isFile() - это файл
java.isDirectory() - это директория

java.length() - размер

boolean succes = file.createNewFile() - создает файл и возвращает true, если все успешно
boolean succes = file.delete() - удаляет файл и возвращает ноль, если все успешно, если директория, то она должна быть пустой
boolean succes = file.renameTo(targetFile) - меняет название файла, но принимает не строчку, а экземпляр файл и может оказаться в другой директории

Новый пакет для работы с файлами:
java.nio.file.Path

Path path = Paths.get(way);
File fromPath = path.toFile();
Path fromFile = fromPath.toPath();

Изначально Java предоставляла класс File (в пакете java.io) для доступа к файловым системам. 
Этот класс представляет файл/каталог в файловой системе и позволяет выполнять такие операции, 
как проверка на существование файла/каталога, получении свойств, и удаление файла/каталога. 

То есть по факту ближе к логированию и выводу исключительных ситуаций функционал.  

Краткий список недостатков первой I/O API:

Классу File не хватало функциональности. Например не было метода copy для копирования файла/каталога.
1) В классе File определено много методов, которые возвращают Boolean-значение. 
В случае ошибки, возвращалось false, а не бросалось исключение, что затрудняло обнаружение и исправление ошибок.
2) Класс File не предоставляет хорошей обработки символьных ссылок.
3) Класс File обрабатывает файлы/каталоги неэффективно (проблемы с масштабированием);
4) Класс File предоставляет доступ к ограниченному набору атрибутов файлов, который зачастую недостаточен.


Для преодоления этих проблем, в Java 4 введен NIO (New IO). Ключевые особенности NIO:

1) Каналы и селекторы: NIO поддерживает различные типы каналов. 
Канал является абстракцией объектов более низкого уровня файловой системы (например, отображенные в памяти файлы и блокировки файлов), 
что позволяет передавать данные с более высокой скоростью. Каналы не блокируются и поэтому Java предоставляет еще такие инструменты, 
как селектор, который позволяет выбрать готовый канал для передачи данных, и сокет, который является инструментом для блокировки.
2) Буферы: в Java 4 была введена буферизация для всех классов-обёрток примитивов (кроме Boolean). 
Появился абстрактный класс Buffer, который предоставляет такие операции, как clear, flip, mark и т.д. 
Его подклассы предоставляют методы для получения и установки данных.
3) Кодировки: в Java 4 появились кодировки (java.nio.charset), кодеры и декодеры для отображения байт и символов Unicode.
Начиная с Java 7 был введён пакет java.nio.file для лучшей поддержки и обработки символьных ссылок, 
полного доступа к атрибутам и работы с файловой системой через интерфейсы или классы, такие как Path, Paths, and Files.

Класс Path

Прежде чем перейти к более интересному материалу, необходимо рассмотреть базовый класс Path.
Класс Path включает в себя различные методы, которые могут быть использованы для получения информации о пути, 
получения доступа к элементам пути, преобразования пути в другие формы, извлечения части пути. 
Существуют также методы для сравнения строк пути и методы для удаления избыточности.

Для создания экземпляра класса Path, воспульзуемся статическим методом get класса Paths, позволяющего создать путь из строки или URI.


Файлы и атрибуты файлов. Управление метаданными.

Определение «метаданные» можно истолковать как «данные о других данных.» 
В контексте работы с файловой системой, это могут быть данные, содержащиеся в файлах и каталогах, 
а также метаданные, представляющие информацию о каждом из этих объектов: является ли объект обычным файлом, 
директорией, или представляет собой ссылку? Каков его размер, дата создания, дата последнего изменения, 
кто владелец файла, какая группа владельца, и какие права доступа?
Пакет java.nio.file.attribute предоставляет API для управления метаданными файловой системы, 
или, как это обычно называется, — атрибутов файлов. Поскольку разные файловые системы имеют разные понятия о том,
 какие атрибуты должны быть отслежены, наиболее общие атрибуты файла объединяются в так называемые представления. 
 Такое представление отображается с учетом специфики конкретной реализации файловой системы, н-р, POSIX или DOS, 
 или на основе общих функций, таких как информация о владельце файла.
 
Поддерживаются следующие представления:

1. BasicFileAttributeView – базовые атрибуты, поддерживаемые всеми реализациями файловых систем.
2. DosFileAttributeView – расширяет базовые атрибуты, добавлением стандартных четырех бит, 
    которые используются системами, поддерживающими атрибуты DOS.
3. PosixFileAttributeView – поддержка атрибутов стандарта POSIX. 
   Атрибуты включают в себя владельца файла( file owner), группу(group owner), и уровни прав доступа(access permissions).
4. FileOwnerAttributeView – поддерживается всеми системами, реализующими концепцию владельца файла.
5. AclFileAttributeView – поддерживает чтение и модификацию списков управления доступом файла( Access Control Lists (ACL)). 
   Поддерживается модель NFSv4 ACL. Любая модель ACL, такая как Windows ACL, имеющая проработанную систему отображения к модели NFSv4,
   также должна поддерживаться.
6. UserDefinedFileAttributeView – реализация поддержки пользовательских метаданных.


Обход дерева файлов

Получение информации о папках и файлах на диске, довольно типичная задача для прикладных программ. 
Пакет java.nio.file предлагает нам удобное решение такой задачи, предоставляя интерфейс FileVisitor.
FileVisitor определяет требуемое поведение в ключевых точках прохождения процесса: когда файл посещен, 
прежде чем получить доступ к каталогу, после получения доступа к каталогу, или в случае отказа. 
Интерфейс состоит из пяти(! оставлю слово пять из оригинального текста, хотя как не старался нашел только 4! метода) методов,
которые соответствуют этим ситуациях.

источники 
http://www.quizful.net/post/java-nio-tutorial
https://coderlessons.com/articles/java/rabota-s-failami-i-katalogami-v-nio-2
https://urvanov.ru/2016/05/17/java-8-файлы-nio-2/
https://habr.com/ru/flows/develop/

Файлы ввода и вывода:
import java.io.IOException; - ошибка работы потоков

java.io.InputStream - 1
java.io.OutputSream - 2

1) read() - возвращает следующий байт, возвращает int, когда достиг конца, то вернет -1. Чтобы получить byte просто приведем int к нему
skip() - пропускает определенное количество байт

2) write() - для записи
flush() - сбрасывает возможные буфера

Если старая версия файлов:
InputStream inputStream = new FileInputStream(new File("in.txt"));
OutputStream outputStream = new FileOutputStream(new File("out.txt"));

Если новая:
InputStream inputStream = Files.newInputStream(Paths.get("in.txt"));
OutputStream outputStream = Files.newOutputStream(Paths.get("out.txt"));

Можно скармливать массивы байт и обратно их получать

DataOutputStream - заворачивает обычный стрим и дает возможность выводить спокойно все остальные типы
DataInputStream - дает возможность читать все остальные типы

DeflaterOutputStream - организует быстрое сжатие данных с помощью алгоритма deflater
InflaterOutputStream - организует распаковку данных сжатых с помощью алгоритма deflater

Классы для работы с текстовыми данными в файлах
java.io.Reader - чтение
java.io.Writer - запись

Превратить произвольный пакет байтов в поток символов
Reader reader = new InputStreamReader(inputStream, "UTF_8");

java.nio.charset - для получения charset
Charset charset = StandartCharsets.UTF_8;
Writer writer = new OutputStreamWriter(outputStream, charset);

Получить кодировку от строки
Charset.forName("...");

Кодировка системы
Charset.defaultCharset();

Создание:
1 Способ без права на указания на кодировку
Reader reader = new FileReader("in.txt"); - создание на чтение
Writer writer = new FileWrite("out.txt"); - создание на чтение

2 Способ, с помощью которого, можно указывать кодировку - рекомендуется
Reader reader = new InputStreamReader(new FileInputStream("in.txt"), StandartCharsets.UTF_8); - на чтение
Writer writer = new OutputStreamWriter(new FileOutputStream("out.txt"), StandartCharsets.UTF_8); - на запись

Создание BufferReader
BufferReader reader = Files.newBufferReader(Paths.get("name"), StandartCharsets.UTF_8);

Если файл небольшой, то можно сразу полностью считать в список
List<string> lines = Files.readAllLines(Paths.get("name"), StandartCharsets.UTF_8); - считать весь файл в лист по строчкам

Также можно сразу записать список в файл
List<string> lines = Arrays.alList("hello", "world");
Files.write(Paths.get("name"), lines, StandartCharsets.UTF_8); - записать в файл массив сразу

Оборачивает Writer
Удобное использование PrintWriter
1) print()
2) println()
3) printf() - первый параметр(строка шаблон), второй параметр(набор параметров, который будут подставляться в эту строку)
Второй параметр - %s(подстановка строки), %d(место подстановки целого числа), %.3f(место подстановки вещественного числа с окргулением 3 после ,)
4) Эти методы не кидают IOException, а имеют булевский флаг, который можно проверить с помощью checkError();

Оборачивает OutputStream
Есть близкий по работе PrintStream, имеет такие же методы

Аналогом является Scanner
Ввод пользователя:
//import java.util.Locale;
//import java.util.Scanner;

Scanner sc = new Scanner(System.in);

Ввести объект int: nextInt()
Ввести объект float: nextFloat()
Ввести объект double: nextDouble()
Ввести объект boolean: nextBoolean()
Ввести строку целиком: nextLine()
Ввести слово (считывается до первого пробела): next()

Пример программы, используемой для получения пользовательского ввода:

import java.util.Scanner;

class MyClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.nextLine());
    }
}

java.nio.charset; - все charset

Установка запятой или точки на разделение числа
scanner.useLocale(Locale.ENGLISH);

Разбиение, для этого используем scanner.useDelimiter(); - по умолчанию пробельные символы, но можно указать что-то свое

scanner.hasNext() - есть что-то еще, не забирая это число
scanner.hasNextDouble() - next число double, не забирая это число
scanner.nextDouble() - забирает число, если оно double
scanner.next() - забирает следующие число

Чтобы получить несколько объектов данных с входящего потока, достаточно одного объекта сканера. Единственный сканер может обрабатывать входные данные различных типов
После использования сканер желательно закрыть командой sc.close().

Существует ProcessBuilder - для запуска внешних процессов

Существует java.nio.channels.* - чтобы не было проблем с ожиданием записи и получения сообщений при многопоточности

Существует Serializable - можно взять объект из памяти виртуальной машины и превратить в набор байтов, этот набор можно записать в файл или
отправить по сети, а потом декадировать

Интерфейс называют марекрным, если в нем не объявлено ни одного метода - признак по которому jvm понимает, что данные объект можно сериализовывать

Если есть поля, которые не надо сохранять мы их можем пометить transient - данные, которые вычисляются легко с помощью тех, которые уже есть в
объекте, или какой-то кэш

Path path = Paths.get("object.bin")
Объекты можно записывать в ObjectOutputStream oos = new OnjectOutputStream(Files.newOutputStream(path)) {
    oos.writeObject(originalClient);
    //originalClient - тоже должен быть Serializable
}

Client deserializedClient;
try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))) {
    deserializedClient = (Client) ois.readObject();
}

Условие, необходимое для того, чтобы экземпляры класса можно было записывать в ObjectOutputStream и читать из ObjectInputStream - 
- Класс должен реализовывать интерфейс java.io.Serializable

Шаблоны или Generics:
Ограничения:
1 - параметризация возможно только с ссылочным типом
2 - внутри нельзя создавать экземпляр или массив T, а также не работает проверка instanceof, тк внутри класса про конкретный T ничего не известно

Optional - нужен, тк мы не может определить допускается ли = null:
String text = "bar";
Или с использованием Optional
Optional<String> optionalText = Optional.of("baz");

Это дает такие возможности, как писать код без if-овы:
Optional<String> baz = Optional.of("baz");
baz.ifPresent(System.out::println); - эквивалентно:
if (s != null) { System.out.println(s); } - где s это обычный String

Заменить тернарный оператор:
Optional<String> bar = Optional.empty();
String value = bar.orElse("bar"); - эквивалентно:
s != null ? s : "bar";

Если бы конструктор Optional был публичный, то экземпляр можно было бы создать так
Optional<String> newOptional = new Optional<>("foobar"); - где <> - dimond operator, где можно было бы явно написать string
Dimond operator-ы работаеют только вместе с new

Класс Optional всегда один и вне зависимости от того, какие параметры мы туда подставляем
Для этого он подставляет везде Object

Можно использовать без указания Generic параметра, но тогда компилятор выдаст предупреждение и надо везде руками приводить

Коллекции - разнообразные контейнеры однотипных элементов
Облегчает работу с массивами, например, чтобы добавить доп элементm если размер массива меньше
Также массив можно менять, а ключевое слово final не поможет, тк оно действует, только на ссылку на массив
Классы коллекция - являются Generic-ами и параметризуются типом хранимом внутри элементом и имеют такие же ограничения

Коллекции - java.util
Коллекции для многопоточных программ в java.util.concurrent;

java.util.Collection - базовые действия для всех коллекций
contains(), add(), remove() - использую equals, поэтому в большинстве случаев его надо переопределять, для нормальной работы

Collection<type> collection = ...
У коллекция есть метод iterator - java.util.Iterable и возвращающий Iterator<type>
У итератора есть методы:
1) hasNext() - есть ли следующий элемент
2) next() - получить следующий элемент
3) remove() - удаляющий текущий элемет из колллекции(текущий - это который был возвращен последний из next)

Прежде чем вызвать next() надо сначала проверить с помощью hasNext(), иначе при отсутствии бросит исключение

Также можно обойти всю коллекцию так:
for (type element : collection) {
    System.out.println(element);
}

Другой способ для обхода:
collection.forEach(System.out::println);

Правда обы этих сокращенных способов не подойдут, например, при удаление, придется использовать iterator

Первая разновидность коллекций - List:
Реализация:
List<String> list1 = new ArrayList<>(); - реализует List поверх массива, дешевый доступ к эллементу по индексу
List<Integer> list2 = new LinkedList<>(); - основан на двухсвязном списке, дешевое удаление и добавление элементов в начале или конце списка

Вторая разновидность - Queue:
Наследник Deque - отличается тем, что можно добавлять и удалять элементы в начале и конце очереди

Реализация:
Deque<Object> deque1 = new ArrayDeque<>();
Deque<Integer> deque1 = new LinkedList<>();

Третья разновидность - Set:
Обеспечивает уникальность содержащихся в ней элементов
Имеет те же методы, что и в Collection

Реализация:
Set<ComplexNumber> numbers = new HashSet<>(); - реализация set на основе hash-таблицы(необходимо определить hashCode() и equals())
В этом случае необходимо, чтобы hashCode() и equals() были согласованы
Важно! Чтобы поля объекта влияющие на hashCode() и equals() не менялись, пока объект находится в HashSet<>()
При таком определение при обходе, элементы у нас могут быть не в правильном порядке
Если хотим, чтобы было в порядке добавления, то:
Set<String> words = new LinkedHashSet<>(); - провязывает все элементы в список, в порядке их добавления

От интерфейса Set наследуется SortedSet - упорядоченное множество, обеспечивает обход интератором в порядке возрастания элементов
Есть метод и другие:
headSet(E toElement); - возвращает подмножество элементов меньших, чем входной параметр. Не копия!!!

Реализация:
SortedSet<String> words = new TreeSet<>(); - внутри самобалансирующиеся двоичное дерево поиска(красно-черное дерево)
Для работы элементы должны реализовывать интерфейс java.lang.Comparable<T> с методом compareTo(T) или в конструктор TreeSet<>() должен передавться
экземпляр java.util.Comparator<T> с методом compare<T, T>

У класса коллекции есть конструктор принимающий другой колллекцию. При этом все элементы исходной, копируются в новую

Четвертая разновидность Map:
java.util.Map - не наследует интерфейс Collection

Реализация:
Map<String, String> map1 = new HashMap<>();
Map<String, String> map1 = new LinkedHashhMap<>();
Map<String, String> map2 = new TreeMap<>();
Отличия и свойства аналогичны set

Для работы с коллекциями иногда помогает java.util.Collections:
Где есть методы:
1) shuffle(list) - для перетасовывания списка
2) sort(list) - для сортировки списка

Также есть семейство, которое начинается с unmodifiable - предоставляют обертку для обращения, но изменить их не получится:
Set<String> set = new unmodifiableSet(originalSet);

Для конвертации в классический массив можно использовать toArray():
List<Integer> list = ...
Object[] array1 = list.toArray(); - Object из-за запрета на создание экземпляров или массивов типа, который указан в качестве параметра Generic

Если нужен массив именно того типа, то:
Integer[] array2 = list.toArray(new Integer[list.size()]);

Сделать обратную конвертацию из массива в коллекцию тоже не трудно:
String[] array = {"A", "B", "C"};

Set<String> set1 = new HashSet<>(Arrays.asList(array));
Или можно:
Set<String> set2 = new HashSet<>();
Collections.addAll(set2, array);

@FunctionalInterface
Функциональные интерфейсы - интерфейс, который имеет только один абстрактный метод:
java.util.function - все стандартные интерфейсы
Виды:
1) Consumer - принимают, но ничего не возвращают взамен
2) Supplier - ничего не принимают в качестве параметра, просто возвращают какое-то значение
3) Predicate - принимают значение какого-то типа, а наружу выдает булевское значение
4) Function - принимают аргументы и возвращают значения какого-то типа
Если параметра 2, то интерфейс BiFunctional
5) UnaryOperator(один параметр), BinaryOperator(два параметра) - операторы, частные случаи функций

Stream - это последовательность элементов, потенциально бесконечная, с возможность выполнять преобразования над ней
java.util.stream
Нельзя обращаться по ключу. Применяя трансформации к стриму никак не вляют на тот источник, откуда они берутся
Stream нужно закрыть, если он что-то выделял, если связан с содержимым файла или директорией на диске

Реализация:
Set<String> vocabulary = ...
Stream<String> stream1 = vocabulary.stream();

Данный Stream нужно будет закрывать
BufferedReader <String> reader = ...
Stream<String> stream2 = reader.lines();

double[] array = ...
DoubleStream streamFromArray = Arrays.stream(array);

IntStream stream1 = ...
stream1.forEach(System.out::println);

IntStream stream2 = ...
OptionalInt result = stream2.findFirst(); - возвращает первый элемент

Stream<String> stream3 = ...
boolean allStringsAreLeast10Chars = stream3.allMatch(s -> s.length() > 10); - проверка, что выполняет для всех элементов
Есть anyMatch - хоть один удовлетворяет и noneMatch - никто не удовлетворяет

Stream<String> stream1 = ...
Optional<String> minString = stream1.min(Comparator.comparing(String.length(), Integer::compare)); - также есть max

Есть count - возвращает количество элементов и есть sum - возвращает сумму
List<String> list = stream1.collect(Collectors.toList());

Также есть свертка(.reduce) для применения бинарных операция, пока не останется один элемент
*/

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