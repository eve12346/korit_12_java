package ch14_casting.centralcontrol;

public class CentralControl2 {
        // field 선언
        private Power[] deviceArray;

        public CentralControl2(Power[] deviceArray) {
            this.deviceArray = deviceArray;
        }

        public void addDevice(Power device) {

            int emptyIndex = checkEmpty();

            if (emptyIndex == -1) {
                System.out.println("더 이상 장치를 연결할 수 없습니다.");
                return;     // 그래야 35번 라인이 실행 안돼서 추가 자체를 안시킬거니까.
            }
            deviceArray[emptyIndex] = device;
            System.out.println(device.getClass().getSimpleName() + " 장치가 추가되었습니다.");

        }

        private int checkEmpty() {
            for (int i = 0; i < deviceArray.length; i++) {
                if (deviceArray[i] == null) return i;
            }
            return -1;
        }


        public void powerOn() {

            for (int i = 0; i < deviceArray.length; i++) {
                if (deviceArray[i] == null) {
                    System.out.println("장치가 없어 실행하지 못했습니다.");
                    continue;

                }
                deviceArray[i].on();
            }

        }

        public void powerOff() {
            for (Power device : deviceArray) {
                if (device == null) {
                    System.out.println("장치가 없어 전원을 켤 수 없습니다.");
                    continue;
                }
                device.off();
            }
        }

        public void showInfo() {
            for (int i = 0; i < deviceArray.length; i++) {
                if (deviceArray[i] == null) {
                    System.out.println("슬롯 [ " + (i + 1) + " ] 번 : Empty");
                    continue;
                }
                System.out.println("슬롯 [ " + (i + 1) + " ] 번 : " + deviceArray[i].getClass().getSimpleName());
            }

        }

    public void performSpecificMethod() {
        for (Power device : deviceArray) {
            if (device instanceof AirConditioner) {
               AirConditioner airConditioner = (AirConditioner) device;
               airConditioner.changeMode();
            } else if (device instanceof Computer) {
               Computer computer = (Computer) device;
               computer.compute();
            } else if (device instanceof Mouse) {
               Mouse mouse = (Mouse) device;
               mouse.leftClick();
            } else if (device instanceof LED) {
               LED led = (LED) device;
               led.changeColor();
            } else if (device instanceof Printer) {
               Printer printer = (Printer) device;
               printer.print();
            } else if (device instanceof Speaker) {
               Speaker speaker = (Speaker) device;
               speaker.changeEqual();
            } else if (device == null) {
               System.out.println("아무 장치도 연결되어 있지 않습니다.");
            } else {
               System.out.println("아직 지원되지 않는 기기 입니다.");
            }
        }
    }

    public void deleteDevice1(int slot) {
        int i = slot - 1;
        System.out.println(deviceArray[i].getClass().getSimpleName() + "을(를) 삭제했씁니다.");
        deviceArray[i] = null;
    }

    public void deleteDevice2(String deviceName) {
        for ( int i =  0 ; i < deviceArray.length ; i ++ ) {
            if ( deviceArray[i] == null);
            else if (deviceName.equals(deviceArray[i].getClass().getSimpleName())) {
               System.out.println(deviceArray[i].getClass().getSimpleName() + "을(를) 삭제했습니다.");
               deviceArray[i] = null;
               return;
            }
        }
    }
}

