import java.util.Arrays;

public class tests {
    public static void main(String[] args) {
        Example[] arr1 = {new Example(), new Example()};
        Example[] arr2 = {new Example(), new Example()};

        System.out.println(Arrays.equals(arr1, arr2));
    }
}

class Example {
    int num = 3;

    public String toString() {
        return "" + num;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Example example = (Example) o;
        return num == example.num;
    }
}
