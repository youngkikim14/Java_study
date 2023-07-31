class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int numer3 = numer1 * denom2;
        int numer4 = numer2 * denom1;

        int denom = denom1 * denom2;
        int numer = numer3 + numer4;

        int max = 0;

        for (int i = 1; i <= denom && i <= numer; i++) {
            if (denom % i == 0 && numer % i == 0) {
                max = i;
            }
        }
        int finalDenom = denom / max;
        int finalNumer = numer / max;
        int[] result = new int[1];
        result[0] = finalNumer;
        result[1] = finalDenom;
        return result;
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound(); // 출력: Dog barks
    }
}

