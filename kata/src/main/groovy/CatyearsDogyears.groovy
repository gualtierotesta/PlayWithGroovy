/**
 * I have a cat and a dog.
 *
 * I got them at the same time as kitten/puppy. That was humanYears years ago.
 *
 * Return their respective ages now as [humanYears,catYears,dogYears]
 *
 * NOTES:
 *
 *     humanYears >= 1
 *     humanYears are whole numbers only
 *
 * Cat Years
 *
 *     15 cat years for first year
 *     +9 cat years for second year
 *     +4 cat years for each year after that
 *
 * Dog Years
 *
 *     15 dog years for first year
 *     +9 dog years for second year
 *     +5 dog years for each year after that
 */

class CatyearsDogyears {

    static humanYearsCatYearsDogYears(humanYears) {
        return [humanYears, catYears(humanYears), dogYears(humanYears)]
    }

    static def catYears(humanYears) {
        def result
        switch (humanYears) {
            case 1:
                result = 15
                break
            case 2:
                result = 15 + 9
                break
            case { it > 2 }:
                result = 15 + 9 + 4 * (humanYears - 2)
                break
        }
        result
    }

    static def dogYears(humanYears) {
        def result
        switch (humanYears) {
            case 1:
                result = 15
                break
            case 2:
                result = 15 + 9
                break
            case { it > 2 }:
                result = 15 + 9 + 5 * (humanYears - 2)
                break
        }
        result
    }
}
