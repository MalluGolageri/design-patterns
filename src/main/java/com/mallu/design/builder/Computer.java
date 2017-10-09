package com.mallu.design.builder;

public abstract class Computer {
    private String HDD;
    private String RAM;

    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;

    public String getHDD() {
        return HDD;
    }

    public String getRAM() {
        return RAM;
    }

    public boolean isGraphicsCardEnabled() {
        return isGraphicsCardEnabled;
    }

    public boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }

    public Computer(ComputerBuilder builder) {
        this.HDD=builder.HDD;
        this.RAM=builder.RAM;
    }

    public static ComputerBuilder compute(String hdd, String ram) {
        return new MyComputer.MyComputerBuilder(hdd, ram);
    }

    public abstract static class ComputerBuilder{
        private String HDD;
        private String RAM;

        public ComputerBuilder(String hdd, String ram){
            this.HDD=hdd;
            this.RAM=ram;
        }

        public abstract ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled);

        public abstract ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled);

        public abstract Computer build();
    }
}

