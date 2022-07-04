package opportunitiesSmartHouse;

public class Radio {
    private int currentChannel;
    private int currentVolume;

    public void setCurrentChannel(int newCurrentChannel) {
        if ((newCurrentChannel < 0) || (newCurrentChannel > 9)) {
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

    public void nextChannel() {
        if (currentChannel < 9) {
            currentChannel = currentChannel + 1;
        } else {
            currentChannel = 0;
        }
    }

    public void prevChannel() {
        if (currentChannel > 0) {
            currentChannel = currentChannel - 1;
        } else {
            currentChannel = 9;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = 10;
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
