package com.ironhack.intList;

public class IntArrayList implements IntList{

    private int[] numbers;

    private int index = 0;

    public IntArrayList() {
        this.numbers = new int[10];
    }

    public int get(int index) {
        return numbers[index];
    }

    public void add(int number) {
        if (index == numbers.length) {

            //numbers = Arrays.copyOf(numbers, (int) (numbers.length * 1.5));
            int[] newArray = new int[(int) (numbers.length * 1.5)];

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
