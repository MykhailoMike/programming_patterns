package main.java.com.mkaloshyn.structural.adapter_06;

public class AdapterCabinetToCloud extends Cabinet implements Cloud {
    @Override
    public void download() {
        readEvent();
    }

    @Override
    public void upload() {
        writeEvent();
    }
}
