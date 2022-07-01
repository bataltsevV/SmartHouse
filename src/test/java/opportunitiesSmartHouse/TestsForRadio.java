package opportunitiesSmartHouse;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class TestsForRadio {

    @ParameterizedTest
    @CsvFileSource(resources = "/DataForTestRadioInit.csv")
    public void testRadioInit(int newCurrentChannel, int newCurrentVolume, int expectedChannel, int expectedVolume){
        Radio radio = new Radio(newCurrentChannel, newCurrentVolume);
        int[] actual = {radio.getCurrentChannel(), radio.getCurrentVolume()};
        int[] expected = {expectedChannel, expectedVolume};
        Assertions.assertArrayEquals(actual, expected);

    }

    @ParameterizedTest
    @CsvFileSource(resources = "/DataForTestSetCurrentChannel.csv")
    public void testSetCurrentChannel(int expected, int newCurrentChannel){
        Radio radio = new Radio(0, 0);
        radio.setCurrentChannel(newCurrentChannel);
        int actual = radio.getCurrentChannel();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/DataForTestNextChannel.csv")
    public void testNextChannel(int expected, int newCurrentChannel){
        Radio radio = new Radio(newCurrentChannel, 0);
        radio.nextChannel();
        int actual = radio.getCurrentChannel();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/DataForTestPrevChannel.csv")
    public void testPrevChannel(int expected, int newCurrentChannel){
        Radio radio = new Radio(newCurrentChannel, 0);
        radio.prevChannel();
        int actual = radio.getCurrentChannel();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/DataForTestIncreaseVolume.csv")
    public void testIncreaseVolume(int expected, int newCurrentVolume){
        Radio radio = new Radio(0, newCurrentVolume);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/DataForTestDecreaseVolume.csv")
    public void testDecreaseVolume(int expected, int newCurrentVolume){
        Radio radio = new Radio(0, newCurrentVolume);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
    }
}
