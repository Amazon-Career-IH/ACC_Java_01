package com.ironhack.intList;

public class IntVector implements IntList{
    private int[] numbers;

    private int index = 0;

    public IntVector() {
        this.numbers = new int[20];
    }

    public int get(int index) {
        return numbers[index];
    }

    public void add(int number) {
        if (index == numbers.length) {

            //numbers = Arrays.copyOf(numbers, (int) (numbers.length * 1.5));
            int[] newArray = new int[numbers.length * 2];

            for (int i = 0; i < numbers.length;i++) {
                newArray[i] = numbers[i];
            }
            numbers = newArray;
        }

        numbers[index] = number;
        index++;
    }

    public int[] getNumbers() {
        return numbers;
    }
}
