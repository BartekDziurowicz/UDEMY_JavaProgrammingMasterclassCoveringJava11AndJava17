package academy.learnprogramming;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    Person person;

    @BeforeEach
    void startUp(){
        person = new Person();
    }

    @ParameterizedTest(name="{index} => age: {0}, output: {1}")
    @CsvSource({
            "-1, 0",
            "0, 0",
            "1, 1",
            "50, 50",
            "99, 99",
            "100, 100",
            "101, 0"
    })
    void setAge(int age, int output) {
        //given
        //when
        person.setAge(age);
        //then
        assertEquals(person.getAge(), output);
    }

    @ParameterizedTest(name="{index} => age: {0}, isTeen: {1}")
    @CsvSource({
            "11, false",
            "12, false",
            "13, true",
            "16, true",
            "19, true",
            "20, false",
            "21, false"
    })
    void isTeen(int age, boolean isTeen) {
        //given
        //when
        person.setAge(age);
        //then
        assertEquals(person.isTeen(), isTeen);
    }

    @ParameterizedTest(name="{index} => first: {0}, last: {1}, full: {2}")
    @CsvSource({
            "'', '', '' ",
            "John, '', John",
            "'', Doe, Doe",
            "John, Doe, John Doe"
    })
    void getFullName(String first, String last, String full) {
        //given
        //when
        person.setFirstName(first);
        person.setLastName(last);
        //then
        assertEquals(person.getFullName(), full);
    }
}