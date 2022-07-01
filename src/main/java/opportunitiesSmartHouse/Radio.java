package opportunitiesSmartHouse;

public class Radio {
    private int currentChannel;

        public Radio(int currentChannel, int currentVolume) {
            if ((currentChannel >= 0) && (currentChannel <= 9)) {
                this.currentChannel = currentChannel;
            }
            if ((currentVolume >= 0) && (currentVolume <= 10)) {
                this.currentVolume = currentVolume;
            }
        }
        public void setCurrentChannel(int newCurrentChannel) {
            if ((newCurrentChannel < 0) || (newCurrentChannel > 9)) {
                return;
            }
            currentChannel = newCurrentChannel;
        }

        public int getCurrentChannel() {
            return currentChannel;
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
    private int currentVolume;

        public int getCurrentVolume() {
            return currentVolume;
        }

        public void increaseVolume() {
            if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
            }
        }

        public void decreaseVolume() {
            if (currentVolume > 0) {
                currentVolume = currentVolume - 1;
            }
        }

}
