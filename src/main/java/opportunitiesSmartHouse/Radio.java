package opportunitiesSmartHouse;

public class Radio {
    private int currentChannel;
    private int currentVolume;
    private int qtyChannel;
    private int maxChannel;
    private int maxVolume = 100;
    private int defaultChannel = 10;
    private int defaultMaxChannel = 9;

    public Radio() {
        this.qtyChannel = defaultChannel;
        this.maxChannel = defaultMaxChannel;
    }

    public Radio(int newQtyChannel) {
        if (newQtyChannel > 0) {
            this.qtyChannel = newQtyChannel;
        }else{
            this.qtyChannel = defaultChannel;
        }
        this.maxChannel = qtyChannel - 1;
    }

    public void setCurrentChannel(int newCurrentChannel) {
        if ((newCurrentChannel < 0) || (newCurrentChannel > maxChannel)) {
            return;
        }
        currentChannel = newCurrentChannel;
    }

    public int getCurrentChannel() {

        return currentChannel;
    }

    public int getCurrentVolume() {

        return currentVolume;
    }

    public int getQtyChannel(){
        return qtyChannel;
    }

    public int getMaxChannel(){
        return maxChannel;
    }

    public void nextChannel() {
        if (currentChannel < maxChannel) {
            currentChannel = currentChannel + 1;
        } else {
            currentChannel = 0;
        }
    }

    public void prevChannel() {
        if (currentChannel > 0) {
            currentChannel = currentChannel - 1;
        } else {
            currentChannel = maxChannel;
        }
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = maxVolume;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = 0;
        }
    }

}
