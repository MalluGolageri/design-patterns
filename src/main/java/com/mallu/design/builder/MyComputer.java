package com.mallu.design.builder;

class MyComputer extends Computer{

    public MyComputer(ComputerBuilder builder){
        super(builder);
    }

    public static class MyComputerBuilder extends ComputerBuilder{
        private boolean isGraphicsCardEnabled;
        private boolean isBluetoothEnabled;

        public MyComputerBuilder(String hdd, String ram){
            super(hdd,ram);
        }

        public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
            this.isGraphicsCardEnabled = isGraphicsCardEnabled;
            return this;
        }

        public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }

        public Computer build(){
            return new MyComputer(this);
        }
    }


}