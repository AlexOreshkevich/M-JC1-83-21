package by.academy.jc.device;

import java.util.*;

public class DeviceStock implements Repository<Device>{

    private List<Device> deviceList;

    public DeviceStock(){
      deviceList = new LinkedList<>();
    }

    @Override
    public Device findById(String id) {
     for(Device device : deviceList){
         if(device.getId().equals(id)){
             return device;
         }
     }
     return null;
    }

    @Override
    public void add(Device device) {
        deviceList.add(device);
    }

    @Override
    public Collection<Device> findAll() {
       return deviceList;
    }
}
