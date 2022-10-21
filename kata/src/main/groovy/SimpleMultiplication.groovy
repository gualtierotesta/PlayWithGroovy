/*
This kata is about multiplying a given number by eight if it is an even number and by nine otherwise.
 */

class SimpleMultiplication {

    static simpleMultiplication(number) {
        return number % 2 ? number * 9 : number * 8
    }

}
