package Object_Oriented;

public class classes {

    public class TV {
        int channel = 1;
        int volumeLevel = 1;
        boolean on = false;

        public TV() {

        }

        public void turnOn() {
            on = true;
        }

        public void turnOff() {
            on = false;
        }

        public void setChannel(int newChannel) {
            if (on && newChannel >= 1 && newChannel <= 120) {
                channel = newChannel;
            }
        }

        public void setVolume(int newVolume) {
            if (on && newVolume >= 0 && newVolume <= 100) {
                volumeLevel = newVolume;
            }
        }

        public void main(String[] args) {
            TV tv1 = new TV();

            tv1.turnOn();
            tv1.setChannel(100);
            tv1.setVolume(4);

            System.out.println(tv1.volumeLevel);

        }

    }

}
