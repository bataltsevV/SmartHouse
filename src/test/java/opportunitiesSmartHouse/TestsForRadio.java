package opportunitiesSmartHouse;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class TestsForRadio {

    @ParameterizedTest
    @CsvFileSource (resources = "/DataForTestRadio.csv")
    public void testRadioInit(int expectedQtyChannel, int expectedMaxChannel, int newQtyChannel){
        Radio radio = new Radio(newQtyChannel);
        int[] actual = {radio.getQtyChannel(), radio.getMaxChannel()};
        int[] expected = {expectedQtyChannel, expectedMaxChannel};
        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void testRadioDefaultInit(){
        Radio radio = new Radio();
        int[] actual = {radio.getQtyChannel(), radio.getMaxChannel()};
        int[] expected = {10, 9};
        Assertions.assertArrayEquals(actual, expected);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/DataForTestSetCurrentChannel.csv")
    public void testSetCurrentChannel(int expected, int newCurrentChannel){
        Radio radio = new Radio();
        radio.setCurrentChannel(newCurrentChannel);
        int actual = radio.getCurrentChannel();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/DataForTestNextChannel.csv")
    public void testNextChannel(int expected, int newCurrentChannel){
        Radio radio = new Radio();
        radio.setCurrentChannel(newCurrentChannel);
        radio.nextChannel();
        int actual = radio.getCurrentChannel();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/DataForTestPrevChannel.csv")
    public void testPrevChannel(int expected, int newCurrentChannel){
        Radio radio = new Radio();
        radio.setCurrentChannel(newCurrentChannel);
        radio.prevChannel();
        int actual = radio.getCurrentChannel();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/DataForTestIncreaseVolume.csv")
    public void testIncreaseVolume(int expected, int qtyIncrease){
        Radio radio = new Radio();
        for (int i = 0; i < qtyIncrease; i++){
            radio.increaseVolume();
        }
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/DataForTestDecreaseVolume.csv")
    public void testDecreaseVolume(int expected, int qtyDecrease){
        Radio radio = new Radio();
        for (int i = 0; i < qtyDecrease; i++) {
            radio.decreaseVolume();
        }
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/DataForTestIncreaseDecreaseVolume.csv")
    public void testIncreaseDecreaseVolume(int expected, int qtyIncrease, int qtyDecrease){
        Radio radio = new Radio();
        for (int i = 0; i < qtyIncrease; i++){
            radio.increaseVolume();
        }
        for (int i = 0; i < qtyDecrease; i++) {
            radio.decreaseVolume();
        }
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}